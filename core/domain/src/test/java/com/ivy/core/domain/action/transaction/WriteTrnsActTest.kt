package com.ivy.core.domain.action.transaction

import android.graphics.Color
import androidx.sqlite.db.SimpleSQLiteQuery
import assertk.assertThat
import assertk.assertions.isEqualTo
import com.ivy.core.domain.algorithm.accountcache.InvalidateAccCacheAct
import com.ivy.data.Sync
import com.ivy.data.SyncState
import com.ivy.data.Value
import com.ivy.data.tag.Tag
import com.ivy.data.transaction.Transaction
import com.ivy.data.transaction.TransactionType
import com.ivy.data.transaction.TrnState
import com.ivy.data.transaction.TrnTime
import io.mockk.InternalPlatformDsl.toStr
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.util.UUID

class WriteTrnsActTest {

    private lateinit var writeTrnsAct: WriteTrnsAct
    private lateinit var transactionDao: TransactionDaoFake
    private lateinit var trnsSignal: TrnsSignal
    private lateinit var timeProvider: TimeProviderFake
    private lateinit var accountCacheDao: AccountCacheDaoFake
    private lateinit var invalidateAccCacheAct: InvalidateAccCacheAct

    @BeforeEach
    fun setUp() {
        transactionDao = TransactionDaoFake()
        trnsSignal = TrnsSignal()
        timeProvider = TimeProviderFake()
        accountCacheDao = AccountCacheDaoFake()
        invalidateAccCacheAct = InvalidateAccCacheAct(accountCacheDao, timeProvider)
        writeTrnsAct = WriteTrnsAct(
            transactionDao,
            trnsSignal,
            timeProvider,
            invalidateAccCacheAct,
            accountCacheDao
        )
    }

    @Test
    fun `Save transaction, check if saved successfully`() = runTest {
        val account = account()

        val tags = listOf(
            tag().copy(id = "tag1", name = "Tag name 1", color = Color.RED),
            tag().copy(id = "tag2", name = "Tag name 2", color = Color.RED),
        )

        val metadata = metadata()


        val transaction =transaction(
            account = account,
            tags = tags,
            metadata = metadata,
            time = TrnTime.Actual(LocalDateTime.now())
        )
        writeTrnsAct.invoke(WriteTrnsAct.Input.CreateNew(trn = transaction))

        val savedTransaction = transactionDao.findBySQL(
            SimpleSQLiteQuery(
                "SELECT * FROM transactions"
            )
        ).first()

        assertThat(savedTransaction.id).isEqualTo(transaction.id.toStr())

        assertThat(savedTransaction.type).isEqualTo(TransactionType.Expense)
        assertThat(savedTransaction.amount).isEqualTo(100.0)
        assertThat(savedTransaction.currency).isEqualTo("USD")
    }
}
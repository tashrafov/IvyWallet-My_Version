package com.ivy.core.domain.action.transaction

import android.graphics.Color
import androidx.sqlite.db.SimpleSQLiteQuery
import androidx.sqlite.db.SupportSQLiteQuery
import assertk.assertThat
import assertk.assertions.isEqualTo
import com.ivy.core.domain.algorithm.accountcache.InvalidateAccCacheAct
import com.ivy.data.Sync
import com.ivy.data.SyncState
import com.ivy.data.Value
import com.ivy.data.account.Account
import com.ivy.data.account.AccountState
import com.ivy.data.tag.Tag
import com.ivy.data.tag.TagState
import com.ivy.data.transaction.Transaction
import com.ivy.data.transaction.TransactionType
import com.ivy.data.transaction.TrnMetadata
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
        val tags = listOf<Tag>(
            Tag(
                id = "tag1",
                name = "Test Tag 1",
                color = Color.RED,
                orderNum = 1.0,
                state = TagState.Default,
                sync = Sync(SyncState.Synced, LocalDateTime.now())
            ),
            Tag(
                id = "tag2",
                name = "Test Tag 2",
                color = Color.GREEN,
                orderNum = 2.0,
                state = TagState.Default,
                sync = Sync(SyncState.Synced, LocalDateTime.now())
            ),
        )

        val metadata = TrnMetadata(
            recurringRuleId = UUID.randomUUID(),
            loanId = UUID.randomUUID(),
            loanRecordId = null
        )


        val transaction = Transaction(
            id = UUID.randomUUID(),
            account = Account(
                id = UUID.randomUUID(),
                name = "Test Account",
                currency = "USD",
                color = Color.BLUE,
                icon = null,
                excluded = false,
                folderId = null,
                orderNum = 0.0,
                state = AccountState.Default,
                sync = Sync(SyncState.Synced, LocalDateTime.now())
            ),
            type = TransactionType.Expense,
            value = Value(100.0, "USD"),
            category = null,
            time = TrnTime.Actual(timeProvider.timeNow()),
            title = "Test Transaction",
            description = "Test Description",
            state = TrnState.Default,
            purpose = null,
            tags = tags,
            attachments = emptyList(),
            sync = Sync(SyncState.Synced, LocalDateTime.now()),
            metadata = metadata
        )
        writeTrnsAct.invoke(WriteTrnsAct.Input.CreateNew(trn = transaction))

        val savedTransaction = transactionDao.findBySQL( SimpleSQLiteQuery(
            "SELECT * FROM transactions"
        )).first()

        assertThat(savedTransaction.id).isEqualTo(transaction.id.toStr())

        assertThat(savedTransaction.type).isEqualTo(TransactionType.Expense)
        assertThat(savedTransaction.amount).isEqualTo(100.0)
        assertThat(savedTransaction.currency).isEqualTo("USD")
    }
}
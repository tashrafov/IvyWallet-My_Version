package com.ivy.core.domain.action.transaction

import android.graphics.Color
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
import java.time.LocalDateTime
import java.util.UUID

fun account(): Account {
    return Account(
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
    )
}

fun tag(): Tag {
    return Tag(
        id = "tag1",
        name = "Test Tag 1",
        color = Color.RED,
        orderNum = 1.0,
        state = TagState.Default,
        sync = Sync(SyncState.Synced, LocalDateTime.now())
    )
}

fun metadata(): TrnMetadata {
    return TrnMetadata(
        recurringRuleId = UUID.randomUUID(),
        loanId = UUID.randomUUID(),
        loanRecordId = null
    )
}

fun transaction(
    account: Account,
    tags: List<Tag>,
    metadata: TrnMetadata,
    time: TrnTime
): Transaction {
    return Transaction(
        id = UUID.randomUUID(),
        account = account,
        type = TransactionType.Expense,
        value = Value(100.0, "USD"),
        category = null,
        time = time,
        title = "Test Transaction",
        description = "Test Description",
        state = TrnState.Default,
        purpose = null,
        tags = tags,
        attachments = emptyList(),
        sync = Sync(SyncState.Synced, LocalDateTime.now()),
        metadata = metadata
    )
}
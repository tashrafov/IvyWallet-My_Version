package com.ivy.core.domain.action.transaction

import androidx.sqlite.db.SupportSQLiteQuery
import com.ivy.core.persistence.dao.trn.AccountIdAndTrnTime
import com.ivy.core.persistence.dao.trn.TransactionDao
import com.ivy.core.persistence.entity.attachment.AttachmentEntity
import com.ivy.core.persistence.entity.trn.TransactionEntity
import com.ivy.core.persistence.entity.trn.TrnMetadataEntity
import com.ivy.core.persistence.entity.trn.TrnTagEntity
import com.ivy.data.SyncState

class TransactionDaoFake : TransactionDao() {
    private var transactions = mutableListOf<TransactionEntity>()
    private var transactionsTags = mutableListOf<TrnTagEntity>()
    private var attachments = mutableListOf<AttachmentEntity>()
    private var metadata = mutableListOf<TrnMetadataEntity>()
    override suspend fun saveTrnEntity(entity: TransactionEntity) {
        transactions.add(entity)
    }

    override suspend fun updateTrnTagsSyncByTrnId(trnId: String, sync: SyncState) {
        transactionsTags = transactionsTags.map { tag ->
            tag.takeUnless { it.trnId == trnId }?.copy(sync = sync) ?: tag
        }.toMutableList()
    }

    override suspend fun saveTags(entity: List<TrnTagEntity>) {
        transactionsTags.addAll(entity)
    }

    override suspend fun updateAttachmentsSyncByAssociatedId(
        associatedId: String,
        sync: SyncState
    ) {
        attachments = attachments.map { attachment ->
            attachment.takeUnless { it.associatedId == associatedId }?.copy(sync = sync)
                ?: attachment
        }.toMutableList()
    }

    override suspend fun saveAttachments(entity: List<AttachmentEntity>) {
        attachments.addAll(entity)
    }

    override suspend fun updateMetadataSyncByTrnId(trnId: String, sync: SyncState) {
        metadata = metadata.map { meta ->
            meta.takeUnless { it.trnId == trnId }?.copy(sync = sync) ?: meta
        }.toMutableList()
    }

    override suspend fun saveMetadata(entity: List<TrnMetadataEntity>) {
        metadata.addAll(entity)
    }

    override suspend fun findAllBlocking(): List<TransactionEntity> {
        return transactions.filter { it.sync != SyncState.Deleting }
    }

    override suspend fun findBySQL(query: SupportSQLiteQuery): List<TransactionEntity> {
        return transactions
    }

    override suspend fun findAccountIdAndTimeById(trnId: String): AccountIdAndTrnTime? {
        val trn = transactions.filter { it.sync == SyncState.Deleting }.find { it.id == trnId }
        return if (trn != null) AccountIdAndTrnTime(trn.accountId, trn.time, trn.timeType) else null
    }

    override suspend fun updateTrnEntitySyncById(trnId: String, sync: SyncState) {
        transactions = transactions.map { trn ->
            trn.takeUnless { it.id == trnId }?.copy(sync = sync) ?: trn
        }.toMutableList()
    }
}
package com.ivy.core.domain.action.transaction

import com.ivy.core.persistence.algorithm.accountcache.AccountCacheDao
import com.ivy.core.persistence.algorithm.accountcache.AccountCacheEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import java.time.Instant

class AccountCacheDaoFake : AccountCacheDao {
    private val accounts = MutableStateFlow(emptyList<AccountCacheEntity>())
    override fun findAccountCache(accountId: String): Flow<AccountCacheEntity?> {
        return accounts.map {
            it.firstOrNull { it.accountId.lowercase() == accountId.lowercase() }
        }
    }

    override suspend fun findTimestampById(accountId: String): Instant? {
        return accounts.value.firstOrNull { it.accountId.lowercase() == accountId.lowercase() }?.timestamp
    }

    override suspend fun save(cache: AccountCacheEntity) {
        val newList = accounts.value.toMutableList()
        newList.add(cache)
        accounts.value = newList
    }

    override suspend fun delete(accountId: String) {
        val newList = accounts.value.toMutableList()
        newList.removeIf { it.accountId.lowercase() == accountId.lowercase() }
        accounts.value = newList
    }

    override suspend fun deleteAll() {
        accounts.value = emptyList()
    }
}
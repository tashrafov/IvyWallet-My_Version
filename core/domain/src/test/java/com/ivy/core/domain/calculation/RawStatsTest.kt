package com.ivy.core.domain.calculation

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.ivy.core.data.common.AssetCode
import com.ivy.core.data.common.PositiveDouble
import com.ivy.core.data.common.Value
import com.ivy.core.data.optimized.LedgerEntry
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class RawStatsTest {

    @Test
    fun `Given income list, calculate total incomes`() {
        val transactions = listOf(
            LedgerEntry.Single.Income(
                Value(
                    PositiveDouble.fromDoubleUnsafe(10.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
            LedgerEntry.Single.Income(
                Value(
                    PositiveDouble.fromDoubleUnsafe(20.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
            LedgerEntry.Single.Income(
                Value(
                    PositiveDouble.fromDoubleUnsafe(30.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
        )

        val result = rawStats(transactions) { emptyList() }

        assertThat(result.incomes.entries.first().value.value).isEqualTo(60.0)
        assertThat(result.incomesCount.value).isEqualTo(3)
    }

    @Test
    fun `Given expense list, calculate total expenses`() {
        val transactions = listOf(
            LedgerEntry.Single.Expense(
                Value(
                    PositiveDouble.fromDoubleUnsafe(10.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
            LedgerEntry.Single.Expense(
                Value(
                    PositiveDouble.fromDoubleUnsafe(20.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
            LedgerEntry.Single.Expense(
                Value(
                    PositiveDouble.fromDoubleUnsafe(30.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), LocalDateTime.now()
            ),
        )

        val result = rawStats(transactions) { emptyList() }

        assertThat(result.expenses.entries.first().value.value).isEqualTo(60.0)
        assertThat(result.expensesCount.value).isEqualTo(3)
    }

    @Test
    fun `Given transfer list, calculate total expense and income`() {
        val transactionTimeMinuteAgo = LocalDateTime.now().minusMinutes(1)
        val transactionTimeTreeMinuteAgo = LocalDateTime.now().minusMinutes(3)
        val transactionTimeTenMinuteAgo = LocalDateTime.now().minusMinutes(10)
        val transactions = listOf(
            LedgerEntry.Single.Income(
                Value(
                    PositiveDouble.fromDoubleUnsafe(10.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), transactionTimeMinuteAgo
            ),
            LedgerEntry.Single.Expense(
                Value(
                    PositiveDouble.fromDoubleUnsafe(20.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), transactionTimeTreeMinuteAgo
            ),
            LedgerEntry.Single.Income(
                Value(
                    PositiveDouble.fromDoubleUnsafe(30.0),
                    AssetCode.fromStringUnsafe("AZN")
                ), transactionTimeTenMinuteAgo
            ),
        )

        val result = rawStats(transactions) { emptyList() }

        assertThat(result.expensesCount.value).isEqualTo(1)
        assertThat(result.expenses.entries.first().value.value).isEqualTo(20.0)

        assertThat(result.incomes.entries.first().value.value).isEqualTo(40.0)
        assertThat(result.incomesCount.value).isEqualTo(2)

        assertThat(result.newestTransaction).isEqualTo(transactionTimeMinuteAgo)
    }
}
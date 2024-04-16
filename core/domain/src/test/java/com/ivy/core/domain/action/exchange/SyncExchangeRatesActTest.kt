package com.ivy.core.domain.action.exchange

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import assertk.assertions.isNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SyncExchangeRatesActTest {

    private lateinit var syncExchangeRatesAct: SyncExchangeRatesAct
    private lateinit var exchangeProvider: RemoteExchangeProviderFake
    private lateinit var exchangeRateDao: ExchangeRateDoaFake

    @BeforeEach
    fun setUp() {
        exchangeProvider = RemoteExchangeProviderFake()
        exchangeRateDao = ExchangeRateDoaFake()
        syncExchangeRatesAct = SyncExchangeRatesAct(exchangeProvider, exchangeRateDao)
    }

    @Test
    fun `Test syncExchangeRatesAct, negatives values ignored`() = runTest {
        syncExchangeRatesAct.invoke("USD")
        val usdRates = exchangeRateDao.findAllByBaseCurrency("USD")
            .first { it.isNotEmpty() }
        val cadRate = usdRates.find { it.currency == "CAD" }

        assertThat(cadRate).isNull()
    }

    @Test
    fun `Test syncExchangeRatesAct, valid values saved`() = runTest {
        syncExchangeRatesAct.invoke("USD")
        val usdRates = exchangeRateDao.findAllByBaseCurrency("USD")
            .first { it.isNotEmpty() }

        val eurRate = usdRates.find { it.currency == "EUR" }
        val jpyRate = usdRates.find { it.currency == "JPY" }
        val gbpRate = usdRates.find { it.currency == "GBP" }
        val audRate = usdRates.find { it.currency == "AUD" }


        assertThat(usdRates.size).isEqualTo(4)
        assertThat(eurRate).isNotNull()
        assertThat(jpyRate).isNotNull()
        assertThat(gbpRate).isNotNull()
        assertThat(audRate).isNotNull()
    }
}
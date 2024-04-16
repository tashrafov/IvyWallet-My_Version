package com.ivy.core.domain.action.exchange

import com.ivy.data.CurrencyCode
import com.ivy.data.exchange.ExchangeProvider
import com.ivy.exchange.RemoteExchangeProvider

class RemoteExchangeProviderFake : RemoteExchangeProvider {

    var ratesMap = mapOf(
        "USD" to mapOf(
            "EUR" to 0.85,
            "JPY" to 110.0,
            "GBP" to 0.75,
            "AUD" to 1.35,
            "CAD" to -1.25,
        ),
        "EUR" to mapOf(
            "USD" to 1.18,
            "JPY" to 130.0,
            "GBP" to 0.90,
            "AUD" to 1.60,
            "CAD" to 1.50,
        )
    )

    override suspend fun fetchExchangeRates(baseCurrency: CurrencyCode): RemoteExchangeProvider.Result {
        return RemoteExchangeProvider.Result(
            ratesMap[baseCurrency] ?: emptyMap(),
            ExchangeProvider.Fawazahmed0
        )
    }
}
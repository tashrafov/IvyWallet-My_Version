package com.ivy.exchangeRates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ivy/exchangeRates/RatesStateFlow;", "Lcom/ivy/core/domain/action/SharedFlowAction;", "Lcom/ivy/exchangeRates/RatesState;", "baseCurrencyFlow", "Lcom/ivy/core/domain/action/settings/basecurrency/BaseCurrencyFlow;", "ratesDao", "Lcom/ivy/core/persistence/algorithm/calc/RatesDao;", "(Lcom/ivy/core/domain/action/settings/basecurrency/BaseCurrencyFlow;Lcom/ivy/core/persistence/algorithm/calc/RatesDao;)V", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "toRateUi", "Lcom/ivy/exchangeRates/data/RateUi;", "baseCurrency", "", "rate", "Lcom/ivy/core/persistence/algorithm/calc/Rate;", "exchange-rates_debug"})
@javax.inject.Singleton
public final class RatesStateFlow extends com.ivy.core.domain.action.SharedFlowAction<com.ivy.exchangeRates.RatesState> {
    private final com.ivy.core.domain.action.settings.basecurrency.BaseCurrencyFlow baseCurrencyFlow = null;
    private final com.ivy.core.persistence.algorithm.calc.RatesDao ratesDao = null;
    
    @javax.inject.Inject
    public RatesStateFlow(@org.jetbrains.annotations.NotNull
    com.ivy.core.domain.action.settings.basecurrency.BaseCurrencyFlow baseCurrencyFlow, @org.jetbrains.annotations.NotNull
    com.ivy.core.persistence.algorithm.calc.RatesDao ratesDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.ivy.exchangeRates.RatesState initialValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Override
    protected kotlinx.coroutines.flow.Flow<com.ivy.exchangeRates.RatesState> createFlow() {
        return null;
    }
    
    private final com.ivy.exchangeRates.data.RateUi toRateUi(java.lang.String baseCurrency, com.ivy.core.persistence.algorithm.calc.Rate rate) {
        return null;
    }
}
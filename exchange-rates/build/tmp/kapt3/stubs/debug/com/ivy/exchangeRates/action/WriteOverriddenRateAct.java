package com.ivy.exchangeRates.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/ivy/exchangeRates/action/WriteOverriddenRateAct;", "Lcom/ivy/core/domain/action/Action;", "Lcom/ivy/core/persistence/entity/exchange/ExchangeRateOverrideEntity;", "", "exchangeRatesOverrideDao", "Lcom/ivy/core/persistence/dao/exchange/ExchangeRateOverrideDao;", "(Lcom/ivy/core/persistence/dao/exchange/ExchangeRateOverrideDao;)V", "action", "input", "(Lcom/ivy/core/persistence/entity/exchange/ExchangeRateOverrideEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchange-rates_debug"})
public final class WriteOverriddenRateAct extends com.ivy.core.domain.action.Action<com.ivy.core.persistence.entity.exchange.ExchangeRateOverrideEntity, kotlin.Unit> {
    private final com.ivy.core.persistence.dao.exchange.ExchangeRateOverrideDao exchangeRatesOverrideDao = null;
    
    @javax.inject.Inject
    public WriteOverriddenRateAct(@org.jetbrains.annotations.NotNull
    com.ivy.core.persistence.dao.exchange.ExchangeRateOverrideDao exchangeRatesOverrideDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object action(@org.jetbrains.annotations.NotNull
    com.ivy.core.persistence.entity.exchange.ExchangeRateOverrideEntity input, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
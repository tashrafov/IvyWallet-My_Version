package com.ivy.exchangeRates.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct;", "Lcom/ivy/core/domain/action/Action;", "Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct$Input;", "", "exchangeRatesOverrideDao", "Lcom/ivy/core/persistence/dao/exchange/ExchangeRateOverrideDao;", "(Lcom/ivy/core/persistence/dao/exchange/ExchangeRateOverrideDao;)V", "action", "input", "(Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct$Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Input", "exchange-rates_debug"})
public final class RemoveOverriddenRateAct extends com.ivy.core.domain.action.Action<com.ivy.exchangeRates.action.RemoveOverriddenRateAct.Input, kotlin.Unit> {
    private final com.ivy.core.persistence.dao.exchange.ExchangeRateOverrideDao exchangeRatesOverrideDao = null;
    
    @javax.inject.Inject
    public RemoveOverriddenRateAct(@org.jetbrains.annotations.NotNull
    com.ivy.core.persistence.dao.exchange.ExchangeRateOverrideDao exchangeRatesOverrideDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object action(@org.jetbrains.annotations.NotNull
    com.ivy.exchangeRates.action.RemoveOverriddenRateAct.Input input, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct$Input;", "", "baseCurrency", "", "currency", "(Ljava/lang/String;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "exchange-rates_debug"})
    public static final class Input {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String baseCurrency = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String currency = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.action.RemoveOverriddenRateAct.Input copy(@org.jetbrains.annotations.NotNull
        java.lang.String baseCurrency, @org.jetbrains.annotations.NotNull
        java.lang.String currency) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Input(@org.jetbrains.annotations.NotNull
        java.lang.String baseCurrency, @org.jetbrains.annotations.NotNull
        java.lang.String currency) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBaseCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCurrency() {
            return null;
        }
    }
}
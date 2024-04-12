package com.ivy.exchangeRates;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u0014\u0010\u000b\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/ivy/exchangeRates/ExchangeRatesViewModel;", "Lcom/ivy/core/domain/SimpleFlowViewModel;", "Lcom/ivy/exchangeRates/RatesState;", "Lcom/ivy/exchangeRates/RatesEvent;", "removeOverriddenRateAct", "Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct;", "writeOverriddenRateAct", "Lcom/ivy/exchangeRates/action/WriteOverriddenRateAct;", "ratesFlow", "Lcom/ivy/exchangeRates/RatesStateFlow;", "(Lcom/ivy/exchangeRates/action/RemoveOverriddenRateAct;Lcom/ivy/exchangeRates/action/WriteOverriddenRateAct;Lcom/ivy/exchangeRates/RatesStateFlow;)V", "initialUi", "getInitialUi", "()Lcom/ivy/exchangeRates/RatesState;", "searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "uiFlow", "Lkotlinx/coroutines/flow/Flow;", "getUiFlow", "()Lkotlinx/coroutines/flow/Flow;", "handleAddRate", "", "event", "Lcom/ivy/exchangeRates/RatesEvent$AddRate;", "(Lcom/ivy/exchangeRates/RatesEvent$AddRate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEvent", "(Lcom/ivy/exchangeRates/RatesEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRemoveOverride", "Lcom/ivy/exchangeRates/RatesEvent$RemoveOverride;", "(Lcom/ivy/exchangeRates/RatesEvent$RemoveOverride;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdateRate", "Lcom/ivy/exchangeRates/RatesEvent$UpdateRate;", "(Lcom/ivy/exchangeRates/RatesEvent$UpdateRate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchange-rates_debug"})
public final class ExchangeRatesViewModel extends com.ivy.core.domain.SimpleFlowViewModel<com.ivy.exchangeRates.RatesState, com.ivy.exchangeRates.RatesEvent> {
    private final com.ivy.exchangeRates.action.RemoveOverriddenRateAct removeOverriddenRateAct = null;
    private final com.ivy.exchangeRates.action.WriteOverriddenRateAct writeOverriddenRateAct = null;
    private final com.ivy.exchangeRates.RatesStateFlow ratesFlow = null;
    @org.jetbrains.annotations.NotNull
    private final com.ivy.exchangeRates.RatesState initialUi = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.ivy.exchangeRates.RatesState> uiFlow = null;
    
    @javax.inject.Inject
    public ExchangeRatesViewModel(@org.jetbrains.annotations.NotNull
    com.ivy.exchangeRates.action.RemoveOverriddenRateAct removeOverriddenRateAct, @org.jetbrains.annotations.NotNull
    com.ivy.exchangeRates.action.WriteOverriddenRateAct writeOverriddenRateAct, @org.jetbrains.annotations.NotNull
    com.ivy.exchangeRates.RatesStateFlow ratesFlow) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.ivy.exchangeRates.RatesState getInitialUi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected kotlinx.coroutines.flow.Flow<com.ivy.exchangeRates.RatesState> getUiFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleEvent(@org.jetbrains.annotations.NotNull
    com.ivy.exchangeRates.RatesEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleRemoveOverride(com.ivy.exchangeRates.RatesEvent.RemoveOverride event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleUpdateRate(com.ivy.exchangeRates.RatesEvent.UpdateRate event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleAddRate(com.ivy.exchangeRates.RatesEvent.AddRate event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
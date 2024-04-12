package com.ivy.exchangeRates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/ivy/exchangeRates/RatesEvent;", "", "AddRate", "RemoveOverride", "Search", "UpdateRate", "Lcom/ivy/exchangeRates/RatesEvent$AddRate;", "Lcom/ivy/exchangeRates/RatesEvent$RemoveOverride;", "Lcom/ivy/exchangeRates/RatesEvent$Search;", "Lcom/ivy/exchangeRates/RatesEvent$UpdateRate;", "exchange-rates_debug"})
public abstract interface RatesEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ivy/exchangeRates/RatesEvent$Search;", "Lcom/ivy/exchangeRates/RatesEvent;", "query", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "exchange-rates_debug"})
    public static final class Search implements com.ivy.exchangeRates.RatesEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String query = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.RatesEvent.Search copy(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
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
        
        public Search(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuery() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ivy/exchangeRates/RatesEvent$RemoveOverride;", "Lcom/ivy/exchangeRates/RatesEvent;", "rate", "Lcom/ivy/exchangeRates/data/RateUi;", "(Lcom/ivy/exchangeRates/data/RateUi;)V", "getRate", "()Lcom/ivy/exchangeRates/data/RateUi;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "exchange-rates_debug"})
    public static final class RemoveOverride implements com.ivy.exchangeRates.RatesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ivy.exchangeRates.data.RateUi rate = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.RatesEvent.RemoveOverride copy(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate) {
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
        
        public RemoveOverride(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi getRate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/ivy/exchangeRates/RatesEvent$UpdateRate;", "Lcom/ivy/exchangeRates/RatesEvent;", "rate", "Lcom/ivy/exchangeRates/data/RateUi;", "newRate", "", "(Lcom/ivy/exchangeRates/data/RateUi;D)V", "getNewRate", "()D", "getRate", "()Lcom/ivy/exchangeRates/data/RateUi;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "exchange-rates_debug"})
    public static final class UpdateRate implements com.ivy.exchangeRates.RatesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ivy.exchangeRates.data.RateUi rate = null;
        private final double newRate = 0.0;
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.RatesEvent.UpdateRate copy(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate, double newRate) {
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
        
        public UpdateRate(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate, double newRate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi getRate() {
            return null;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final double getNewRate() {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ivy/exchangeRates/RatesEvent$AddRate;", "Lcom/ivy/exchangeRates/RatesEvent;", "rate", "Lcom/ivy/exchangeRates/data/RateUi;", "(Lcom/ivy/exchangeRates/data/RateUi;)V", "getRate", "()Lcom/ivy/exchangeRates/data/RateUi;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "exchange-rates_debug"})
    public static final class AddRate implements com.ivy.exchangeRates.RatesEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ivy.exchangeRates.data.RateUi rate = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.RatesEvent.AddRate copy(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate) {
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
        
        public AddRate(@org.jetbrains.annotations.NotNull
        com.ivy.exchangeRates.data.RateUi rate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ivy.exchangeRates.data.RateUi getRate() {
            return null;
        }
    }
}
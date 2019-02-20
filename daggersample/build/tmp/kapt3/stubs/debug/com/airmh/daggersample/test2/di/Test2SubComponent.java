package com.airmh.daggersample.test2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/airmh/daggersample/test2/di/Test2SubComponent;", "Ldagger/android/AndroidInjector;", "Lcom/airmh/daggersample/test2/Test2Activity;", "Builder", "daggersample_debug"})
@dagger.Subcomponent(modules = {com.airmh.daggersample.test2.di.Test2SubModule.class})
public abstract interface Test2SubComponent extends dagger.android.AndroidInjector<com.airmh.daggersample.test2.Test2Activity> {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/airmh/daggersample/test2/di/Test2SubComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/airmh/daggersample/test2/Test2Activity;", "()V", "daggersample_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.airmh.daggersample.test2.Test2Activity> {
        
        public Builder() {
            super();
        }
    }
}
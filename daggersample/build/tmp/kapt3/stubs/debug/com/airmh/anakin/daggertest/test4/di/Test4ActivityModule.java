package com.airmh.anakin.daggertest.test4.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/airmh/anakin/daggertest/test4/di/Test4ActivityModule;", "", "()V", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "activity", "Lcom/airmh/daggersample/test4/Test4Activity;", "daggersample_debug"})
@dagger.Module()
public final class Test4ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.support.v4.app.FragmentManager fragmentManager(@org.jetbrains.annotations.NotNull()
    com.airmh.daggersample.test4.Test4Activity activity) {
        return null;
    }
    
    public Test4ActivityModule() {
        super();
    }
}
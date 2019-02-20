package com.airmh.daggersample.test2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/airmh/daggersample/test2/di/Test2Module;", "", "()V", "bindTest2Activity", "Ldagger/android/AndroidInjector$Factory;", "builder", "Lcom/airmh/daggersample/test2/di/Test2SubComponent$Builder;", "daggersample_debug"})
@dagger.Module(subcomponents = {com.airmh.daggersample.test2.di.Test2SubComponent.class})
public abstract class Test2Module {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.ClassKey(value = com.airmh.daggersample.test2.Test2Activity.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract dagger.android.AndroidInjector.Factory<?> bindTest2Activity(@org.jetbrains.annotations.NotNull()
    com.airmh.daggersample.test2.di.Test2SubComponent.Builder builder);
    
    public Test2Module() {
        super();
    }
}
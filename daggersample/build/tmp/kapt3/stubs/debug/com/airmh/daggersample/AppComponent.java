package com.airmh.daggersample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/airmh/daggersample/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/DaggerApplication;", "Builder", "daggersample_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.airmh.daggersample.test2.di.Test2Module.class, com.airmh.daggersample.test3.di.Test3Module.class, com.airmh.daggersample.test4.di.Test4Module.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<dagger.android.DaggerApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/airmh/daggersample/AppComponent$Builder;", "", "applicationBind", "application", "Ldagger/android/DaggerApplication;", "build", "Lcom/airmh/daggersample/AppComponent;", "daggersample_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.airmh.daggersample.AppComponent.Builder applicationBind(@org.jetbrains.annotations.NotNull()
        dagger.android.DaggerApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.airmh.daggersample.AppComponent build();
    }
}
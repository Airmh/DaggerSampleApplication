package com.airmh.daggersample.test3.di

import com.airmh.daggersample.test3.Test3InjectClass
import dagger.Module
import dagger.Provides

@Module
class Test3InjectorModule {

    @Provides
    fun createTestClass(): Test3InjectClass = Test3InjectClass()

}
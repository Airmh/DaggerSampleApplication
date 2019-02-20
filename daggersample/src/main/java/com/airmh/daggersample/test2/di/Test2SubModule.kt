package com.airmh.daggersample.test2.di

import com.airmh.daggersample.test2.Test2InjectClass
import dagger.Module
import dagger.Provides

@Module
class Test2SubModule {

    @Provides
    fun createTestClass(): Test2InjectClass = Test2InjectClass()

}
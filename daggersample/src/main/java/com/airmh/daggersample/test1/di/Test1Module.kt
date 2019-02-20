package com.airmh.daggersample.test1.di

import com.airmh.daggersample.test1.Test1InjectClass
import dagger.Module
import dagger.Provides

@Module
class Test1Module {
    @Provides
    fun createTestClass(): Test1InjectClass = Test1InjectClass()

}
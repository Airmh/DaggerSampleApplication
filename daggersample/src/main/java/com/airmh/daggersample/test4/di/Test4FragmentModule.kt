package com.airmh.anakin.daggertest.test4.di

import com.airmh.anakin.daggertest.test4.Test4InjectClass
import dagger.Module
import dagger.Provides

@Module
class Test4FragmentModule {

    @Provides
    fun createTestClass(): Test4InjectClass = Test4InjectClass()

}
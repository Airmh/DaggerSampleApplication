package com.airmh.daggersample.test3.di

import com.airmh.daggersample.test3.Test3Activity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Test3Module {

    @ContributesAndroidInjector(modules = [Test3InjectorModule::class])
    abstract fun bindTest3Activity(): Test3Activity

}
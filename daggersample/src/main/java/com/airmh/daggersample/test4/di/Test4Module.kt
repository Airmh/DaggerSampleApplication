package com.airmh.daggersample.test4.di

import com.airmh.anakin.daggertest.test4.di.Test4ActivityModule
import com.airmh.anakin.daggertest.test4.di.Test4FragmentProvider
import com.airmh.daggersample.test4.Test4Activity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Test4Module {

    @ContributesAndroidInjector(modules = [Test4ActivityModule::class, Test4FragmentProvider::class])
    abstract fun bindTest4Activity(): Test4Activity

}
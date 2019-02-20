package com.airmh.anakin.daggertest.test4.di

import com.airmh.anakin.daggertest.test4.Test4Fragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Test4FragmentProvider {

    @ContributesAndroidInjector(modules = [Test4FragmentModule::class])
    abstract fun bindTest4Fragment(): Test4Fragment

}
package com.airmh.daggersample.test2.di

import com.airmh.daggersample.test2.Test2Activity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [Test2SubModule::class])
interface Test2SubComponent: AndroidInjector<Test2Activity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<Test2Activity>()
}
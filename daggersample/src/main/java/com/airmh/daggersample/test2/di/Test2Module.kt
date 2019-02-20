package com.airmh.daggersample.test2.di

import com.airmh.daggersample.test2.Test2Activity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [Test2SubComponent::class])
abstract class Test2Module {

    @Binds
    @IntoMap
    @ClassKey(Test2Activity::class)
    abstract fun bindTest2Activity(builder: Test2SubComponent.Builder): AndroidInjector.Factory<*>

}

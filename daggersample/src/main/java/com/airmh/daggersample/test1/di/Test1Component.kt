package com.airmh.daggersample.test1.di

import com.airmh.daggersample.test1.Test1Activity
import dagger.Component

@Component(modules = [Test1Module::class])
interface Test1Component{

    fun inject(test1Activity: Test1Activity)

}
package com.airmh.daggersample

import com.airmh.daggersample.test2.di.Test2Module
import com.airmh.daggersample.test3.di.Test3Module
import com.airmh.daggersample.test4.di.Test4Module
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

@Component(modules = [AndroidInjectionModule::class,
    Test2Module::class,
    Test3Module::class,
    Test4Module::class])
interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun applicationBind(application: DaggerApplication): Builder
        fun build(): AppComponent
    }
}
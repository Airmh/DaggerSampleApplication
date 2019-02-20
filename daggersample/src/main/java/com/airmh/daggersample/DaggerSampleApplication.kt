package com.airmh.daggersample

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerSampleApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().applicationBind(this).build()

}
package com.airmh.anakin.daggertest.test4.di

import android.support.v4.app.FragmentManager
import com.airmh.daggersample.test4.Test4Activity
import dagger.Module
import dagger.Provides

@Module
class Test4ActivityModule {

    @Provides
    fun fragmentManager(activity: Test4Activity): FragmentManager = activity.supportFragmentManager

}
package com.airmh.daggersample.test4

import android.os.Bundle
import android.support.v4.app.FragmentManager
import com.airmh.anakin.daggertest.test4.Test4Fragment
import com.airmh.daggersample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class Test4Activity: DaggerAppCompatActivity() {

    @Inject
    lateinit var fm: FragmentManager

    @Inject
    lateinit var test4Fragment: Test4Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test4_layout)
        initFragment()
    }

    private fun initFragment() {
        val ft = fm.beginTransaction()
        ft?.add(R.id.main, test4Fragment)
        ft?.show(test4Fragment)
        ft?.commitAllowingStateLoss()
    }

}
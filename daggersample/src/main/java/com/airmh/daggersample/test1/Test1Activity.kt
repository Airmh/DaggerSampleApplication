package com.airmh.daggersample.test1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airmh.daggersample.R
import com.airmh.daggersample.test1.di.DaggerTest1Component
import com.airmh.daggersample.test1.di.Test1Module
import kotlinx.android.synthetic.main.test1_layout.*
import javax.inject.Inject

class Test1Activity: AppCompatActivity() {

    @Inject
    lateinit var test1InjectClass: Test1InjectClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test1_layout)

        DaggerTest1Component.builder()
            .test1Module(Test1Module())
            .build()
            .inject(this)

        test1TextView.text = test1InjectClass.getTest1Text()
    }
}
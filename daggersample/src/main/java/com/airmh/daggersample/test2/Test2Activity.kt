package com.airmh.daggersample.test2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airmh.daggersample.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.test2_layout.*
import javax.inject.Inject

class Test2Activity: AppCompatActivity() {

    @Inject
    lateinit var test2InjectClass: Test2InjectClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test2_layout)

        AndroidInjection.inject(this)

        test2TextView.text = test2InjectClass.getTest2Text()
    }
}
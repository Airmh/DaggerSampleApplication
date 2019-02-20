package com.airmh.daggersample.test3

import android.os.Bundle
import com.airmh.daggersample.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.test3_layout.*
import javax.inject.Inject

class Test3Activity: DaggerAppCompatActivity() {

    @Inject
    lateinit var test3InjectClass: Test3InjectClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test3_layout)

        test3TextView.text = test3InjectClass.getTest3Text()
    }

}
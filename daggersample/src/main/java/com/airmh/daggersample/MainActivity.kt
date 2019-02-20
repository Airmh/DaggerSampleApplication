package com.airmh.daggersample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airmh.daggersample.test1.Test1Activity
import com.airmh.daggersample.test2.Test2Activity
import com.airmh.daggersample.test3.Test3Activity
import com.airmh.daggersample.test4.Test4Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToActivity1.setOnClickListener {
            startActivity(Intent(this, Test1Activity::class.java))
        }

        goToActivity2.setOnClickListener {
            startActivity(Intent(this, Test2Activity::class.java))
        }

        goToActivity3.setOnClickListener {
            startActivity(Intent(this, Test3Activity::class.java))
        }

        goToActivity4.setOnClickListener {
            startActivity(Intent(this, Test4Activity::class.java))
        }
    }
}

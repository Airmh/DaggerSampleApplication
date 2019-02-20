package com.airmh.anakin.daggertest.test4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airmh.daggersample.R
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.test4_fragment_layout.*
import javax.inject.Inject

class Test4Fragment @Inject constructor(): DaggerFragment() {

    @Inject
    lateinit var test4InjectClass: Test4InjectClass

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.test4_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test4TextView.text = test4InjectClass.getTest4Text()
    }

}
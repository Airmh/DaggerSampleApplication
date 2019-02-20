package com.airmh.anakin.daggertest.test4

import javax.inject.Inject

class Test4InjectClass @Inject constructor() {
    fun getTest4Text() = "Test4InjectText"
}
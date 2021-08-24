package com.nepplus.librarypractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity {

    //this자리에 대신 들어갈 변수.

    val mContext = this

    abstract fun setupEvents()

    abstract fun setValues()


}
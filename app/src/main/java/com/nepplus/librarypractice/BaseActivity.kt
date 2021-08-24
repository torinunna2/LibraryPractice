package com.nepplus.librarypractice

abstract class BaseActivity {

    //this자리에 대신 들어갈 변수.

    val mContext = this

    abstract fun setupEvents()

    abstract fun setValues()


}
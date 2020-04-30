package com.xlh.navigationdemo.viewmodle

import androidx.lifecycle.ViewModel

/**
Date: 20-4-30
Time: 下午4:25
Author: dain
 */
class NumberModel : ViewModel() {
    var number = 0


    fun plusOne() {
        number++
    }

    fun plusTwo() {
        number += 2
    }


}
package com.example.myapplication

import com.example.calculator_lv4.AbstractOperation


//Lv.4
class AddOperation : AbstractOperation(){

    override fun operate(num1: Int, num2: Int): Double {
        val result = (num1 + num2).toDouble()
        return result
    }
}

package com.example.calculator_lv4

import com.example.myapplication.Calculator

//Lv.4
class SubstractOperation : AbstractOperation() {

    override fun operate(num1: Int, num2: Int) : Double {
        var result = (num1 - num2).toDouble()
        return result
    }
}

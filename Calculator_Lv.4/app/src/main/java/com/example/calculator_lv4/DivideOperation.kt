package com.example.calculator_lv4


//Lv.4
class DivideOperation : AbstractOperation() {

    override fun operate(num1: Int, num2: Int) : Double{
        val result = (num1 / num2).toDouble()
        return result
    }
}

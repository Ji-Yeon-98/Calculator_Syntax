package com.example.myapplication

import com.example.myapplication.Calculator

//Lv.3
class MultiplyOperation : Calculator(){

    override fun operate(num1:Int, num2:Int): Double {
        var result = (num1 * num2).toDouble()
        return result
    }
}



////예제 Lv.3
//class MultiplyOperation{
//    fun operate(num1: Int, num2: Int): Double {
//        return (num1 * num2).toDouble()
//    }
//}

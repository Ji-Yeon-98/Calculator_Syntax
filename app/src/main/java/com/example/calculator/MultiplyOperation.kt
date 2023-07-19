package com.example.calculator

import com.example.myapplication.Calculator

//Lv.4
class MultiplyOperation : AbstractOperation() {

    override fun operate(num1: Int, num2: Int) : Double{
        val result = (num1 * num2).toDouble()
        return result
    }
}


//Lv.3
//class MultiplyOperation : Calculator(){
//
//    override fun multiply(num1:Int, num2:Int){
//        var result = num1 * num2
//        println("${num1} * ${num2} = ${result}")
//    }
//}



////예제 Lv.3
//class MultiplyOperation{
//    fun operate(num1: Int, num2: Int): Double {
//        return (num1 * num2).toDouble()
//    }
//}


////예제 Lv.4
//class MultiplyOperation : AbstractOperation(){
//    override fun operate(num1: Int, num2: Int): Double {
//        return (num1 * num2).toDouble()
//    }
//}
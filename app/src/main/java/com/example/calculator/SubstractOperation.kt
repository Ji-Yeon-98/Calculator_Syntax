package com.example.calculator

import com.example.myapplication.Calculator

//Lv.4
class SubstractOperation : AbstractOperation() {

    override fun operate(num1: Int, num2: Int) : Double {
        var result = (num1 - num2).toDouble()
        return result
    }
}


////Lv.3
//class SubstractOperation : Calculator(){
//
//    override fun operate(num1:Int, num2:Int) :Double {
//        var result = (num1 - num2).toDouble()
//        return result
//    }
//}



////예제 Lv.3
//class SubstractOperation(){
//    fun operate(num1:Int, num2:Int):Double{
//        return (num1-num2).toDouble()
//    }
//}


////예제 Lv.4
//class SubstractOperation() : AbstractOperation(){
//    override fun operate(num1:Int, num2:Int):Double{
//        return (num1-num2).toDouble()
//    }
//}

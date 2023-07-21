package com.example.myapplication


//Lv.3
class DivideOperation : Calculator(){

    override fun operate(num1:Int, num2:Int) : Double{
        var result = (num1 / num2).toDouble()
        return result
    }
}



////예제 Lv.3
//class DivideOperation{
//    fun operate(num1: Int, num2: Int): Double {
//        return (num1 / num2).toDouble()
//    }
//}

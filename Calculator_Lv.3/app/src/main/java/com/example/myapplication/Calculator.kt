package com.example.myapplication


//Lv.3
open class Calculator() {
    var result:Double = 0.0

    open fun operate(num1: Int, num2: Int) : Double{
        return result
    }
}

////예제 LV.3
//open class Calculator(){
//    //AddOperation 객체를 매개변수로 입력 받음
//    fun addOperation(AddoperationObject: AddOperation, num1: Int, num2: Int): Double {
//        return AddoperationObject.operate(num1, num2)
//    }
//
//    fun substractOperation(SubstractoperationObject: SubstractOperation, num1: Int, num2: Int): Double {
//        return SubstractoperationObject.operate(num1, num2)
//    }
//
//    fun multiplyOperation(MultiplyoperationObject: MultiplyOperation, num1: Int, num2: Int): Double {
//        return MultiplyoperationObject.operate(num1, num2)
//    }
//
//    fun divideOperation(DivideoperationObject: DivideOperation, num1: Int, num2: Int): Double {
//        return DivideoperationObject.operate(num1, num2)
//    }
//}

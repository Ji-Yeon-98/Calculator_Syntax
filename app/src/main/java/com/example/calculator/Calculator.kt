package com.example.myapplication

import com.example.calculator.AbstractOperation



//구체화된 클래스 (AddOperation)에 의존하는 것이 아닌 추상화된 클래스(AbsctractOperation)에 의존
//Calculator 클래스 수정하지 않고도 새로운 연산 추가 가능, 새로운 클래스 작성 후 AbstractOperation 상속

//Lv.4
open class Calculator(val operation: AbstractOperation){
    var result:Double = 0.0

    fun operate(num1: Int, num2: Int) : Double{
        return operation.operate(num1, num2)
    }
}


////Lv.3
//open class Calculator() {
//    var result:Double = 0.0
//
//    open fun operate(num1: Int, num2: Int) : Double{
//        return result
//    }
//}



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


////예제 LV.4
//open class Calculator(val operation: AbstractOperation){
//    fun operate(num1: Int, num2: Int): Double{
//        return operation.operate(num1, num2)
//    }
//}
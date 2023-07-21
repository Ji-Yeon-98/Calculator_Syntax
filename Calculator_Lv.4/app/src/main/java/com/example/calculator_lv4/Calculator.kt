package com.example.myapplication

import com.example.calculator_lv4.AbstractOperation


//구체화된 클래스 (AddOperation)에 의존하는 것이 아닌 추상화된 클래스(AbsctractOperation)에 의존
//Calculator 클래스 수정하지 않고도 새로운 연산 추가 가능, 새로운 클래스 작성 후 AbstractOperation 상속

//Lv.4
open class Calculator(val operation: AbstractOperation){
    var result:Double = 0.0

    fun operate(num1: Int, num2: Int) : Double{
        return operation.operate(num1, num2)
    }
}

package com.example.myapplication

import com.example.calculator.DivideOperation
import com.example.calculator.MultiplyOperation
import com.example.calculator.SubstractOperation


//Lv.4
fun main(){
    var calculator = Calculator(AddOperation())
    println("3 + 2 = ${calculator.operate(3,2)}")

    var calculator2 = Calculator(SubstractOperation())
    println("3 - 2 = ${calculator2.operate(3,2)}")

    var calculator3 = Calculator(MultiplyOperation())
    println("3 * 2 = ${calculator3.operate(3,2)}")

    var calculator4 = Calculator(DivideOperation())
    println("4 / 2 = ${calculator4.operate(4,2)}")
}


////Lv.3
//fun main(){
//    var calculator = Calculator()
//
//    var addoperation = AddOperation()
//    println("3 + 2 = ${addoperation.operate(3,2)}")
//
//    var suboperation = SubstractOperation()
//    println("3 - 2 = ${suboperation.operate(3,2)}")
//}




//예제 Lv.3
//fun main(){
//    val calc = Calculator()
//    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
//    println("3 빼기 2 결과는 : ${calc.substractOperation(SubstractOperation(), 3, 2)} 입니다")
//    println("3 곱하기 2 결과는 : ${calc.multiplyOperation(MultiplyOperation(), 3, 2)} 입니다")
//    println("4 나누기 2 결과는 : ${calc.divideOperation(DivideOperation(), 4, 2)} 입니다")
//}


////예제 Lv.4
//fun main(){
//    val calc = Calculator(DivideOperation())
//    var result = calc.operate(4, 2)
//    println("4 나누기 2 결과는 : ${result} 입니다")
//}
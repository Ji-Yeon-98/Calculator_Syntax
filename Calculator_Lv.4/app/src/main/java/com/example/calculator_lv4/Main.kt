package com.example.myapplication

import com.example.calculator_lv4.DivideOperation
import com.example.calculator_lv4.MultiplyOperation
import com.example.calculator_lv4.SubstractOperation


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

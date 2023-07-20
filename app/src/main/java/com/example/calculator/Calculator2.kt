package com.example.calculator

class Calculator2(val operation : AbstractOperation2) {
    lateinit var number:MutableList<String>

    fun operate(number:MutableList<String>){
        operation.operate(number)
    }

}
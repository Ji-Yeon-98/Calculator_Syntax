package com.example.calculator

class DivideOperation2 : AbstractOperation2(){
    lateinit var number:MutableList<String>

    override fun operate(number: MutableList<String>) {
        var result:Double = number[0].toDouble()

        if (number.isEmpty()){
            println("--------------------------------\n")
        }else {
            for (idx in 1 until number.size) {
                result /= number[idx].toDouble()
            }
            println("결과 : ${result}")
            println("--------------------------------\n")
        }
    }
}
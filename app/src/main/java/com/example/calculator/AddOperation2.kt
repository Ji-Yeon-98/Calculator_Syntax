package com.example.calculator

class AddOperation2 : AbstractOperation2(){
    var result:Double = 0.0
    lateinit var number:MutableList<String>

    override fun operate(number: MutableList<String>) {
        if (number.isEmpty()){
            println("--------------------------------\n")
        }else {
            for (numbers in number) {
                result += numbers.toDouble()
            }
            println("결과 : ${result}")
            println("--------------------------------\n")
        }
    }

}
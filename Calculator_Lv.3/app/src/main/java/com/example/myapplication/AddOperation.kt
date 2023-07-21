package com.example.myapplication


//SRP : 작성된 클래스는 하나의 기능만을 가지며, 클래스가 제공하는 모든 서비스는 그 하나의 책임을 수행하는 데 집중되어 있어야 한다.
//다른 객체와의 의존/연관성 줄어듦


//Lv.3
class AddOperation : Calculator(){

    override fun operate(num1: Int, num2: Int): Double {
        val result = (num1 + num2).toDouble()
        return result
    }
}



////예제 Lv.3
//class AddOperation(){
//    fun operate(num1:Int, num2:Int):Double{
//        return (num1+num2).toDouble()
//    }
//}



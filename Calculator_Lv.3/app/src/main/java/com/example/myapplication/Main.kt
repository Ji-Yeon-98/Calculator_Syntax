package com.example.myapplication

//Lv.3
fun main(){
    var calculator = Calculator()

    var addoperation = AddOperation()
    println("3 + 2 = ${addoperation.operate(3,2)}")

    var suboperation = SubstractOperation()
    println("3 - 2 = ${suboperation.operate(3,2)}")

    var multiplyoperation = MultiplyOperation()
    println("3 * 2 = ${multiplyoperation.operate(3,2)}")

    var divideoperation = DivideOperation()
    println("6 / 2 = ${divideoperation.operate(6,2)}")
}



////예제 Lv.3
//fun main(){
//    val calc = Calculator()
//    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
//    println("3 빼기 2 결과는 : ${calc.substractOperation(SubstractOperation(), 3, 2)} 입니다")
//    println("3 곱하기 2 결과는 : ${calc.multiplyOperation(MultiplyOperation(), 3, 2)} 입니다")
//    println("4 나누기 2 결과는 : ${calc.divideOperation(DivideOperation(), 4, 2)} 입니다")
//}

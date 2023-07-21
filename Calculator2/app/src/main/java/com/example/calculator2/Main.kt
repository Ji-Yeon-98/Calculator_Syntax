import com.example.calculator2.DivideOperation
import com.example.calculator2.MultiplyOperation
import com.example.calculator2.SubstractOperation

fun main(){
    var start = true

    while(start){
        var number:MutableList<String> = mutableListOf()
        println("안녕하세요! 계산기 프로그램입니다.")
        println("[메뉴]")
        println("1.더하기 2.빼기 3.곱하기 4.나누기 5.종료")

        var num = readLine()

        when(num) {
            "1" -> {
                repeatNumber(number)
                var calculator = Calculator(AddOperation())
                calculator.operate(number)
            }
            "2" -> {
                repeatNumber(number)
                var calculator = Calculator(SubstractOperation())
                calculator.operate(number)
            }
            "3" -> {
                repeatNumber(number)
                var calculator = Calculator(MultiplyOperation())
                calculator.operate(number)
            }
            "4" -> {
                repeatNumber(number)
                var calculator = Calculator(DivideOperation())
                calculator.operate(number)
            }
            "5" -> {
                println("종료")
                break
            }
            else -> {
                println("잘못입력하셨습니다.")
                println("--------------------------------\n")
            }
        }
    }
}

fun repeatNumber(number:MutableList<String>) {
    println("몇개의 숫자를 입력하십니까?")
    var repeatNumber = 0
    while (true) {
        try {
            repeatNumber = Integer.parseInt(readLine())
            for (i in 0 until repeatNumber) {
                println("계산할 숫자를 입력하세요!")
                var num1 = readLine()
                number.add(num1!!)
            }
            return
        } catch (e: Exception) {
            println("숫자를 다시 입력해주세요!")
        }
    }
}

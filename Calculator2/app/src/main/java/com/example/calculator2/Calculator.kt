

class Calculator(val operation : AbstractOperation) {
    lateinit var number:MutableList<String>

    fun operate(number:MutableList<String>){
        operation.operate(number)
    }

}
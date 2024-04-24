class Calculator(private val operation: AbstractOperation) {
    fun operation(num1: Double, num2: Double): Double {
        return operation.operation(num1, num2)
    }
}


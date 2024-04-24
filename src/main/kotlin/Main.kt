import myoperator.*

fun main() {
    print("첫번째 수 입력: ")
    val num1 = readln().toDouble()
    print("연산자 입력: ")
    val op = readln()
    print("두번째 수 입력: ")
    val num2 = readln().toDouble()

    var result: Double = 0.toDouble()

    val add = AddOperation()
    val sub = SubtractOperation()
    val mul = MultiplyOperation()
    val div = DivideOperation()
    val mod = ModOperation()

    val addOperator = Calculator(add)
    val subOperator = Calculator(sub)
    val mulOperator = Calculator(mul)
    val divOperator = Calculator(div)
    val modOperator = Calculator(mod)


    when (op) {
        "+" -> {
            result = addOperator.operation(num1, num2)
        }

        "-" -> {
            result = subOperator.operation(num1, num2)
        }

        "*" -> {
            result = mulOperator.operation(num1, num2)
        }

        "/" -> {
            result = divOperator.operation(num1, num2)
        }

        "%" -> {
            result = modOperator.operation(num1, num2)
        }
    }

    println("result : $num1 $op $num2 = $result")

}
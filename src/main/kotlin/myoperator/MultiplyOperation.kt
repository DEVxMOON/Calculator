package myoperator

import AbstractOperation

class MultiplyOperation: AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double = num1 * num2
}

package myoperator
import AbstractOperation

class AddOperation: AbstractOperation(){
    override fun operation(num1: Double, num2: Double): Double = num1 + num2
}
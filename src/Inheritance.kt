import java.lang.Exception
import java.lang.NumberFormatException
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main () {
    // val circle = Circle(6.3)

    //val randomRectangle = Rectangle.randomRectangle()
    /* val sideA = 3.0
    val sideB = 3.0
    val sideC = 3.0
    val parallelogram = object : Shape("Parallelogram", sideA, sideB, sideC ){

        override fun area(): Double {
            return sideA * sideC
        }

        override fun perimeter(): Double {
            return 2 * sideA + 2 * sideB
        }
    }*/

    val division = try {
        divide(12.0 , 0.0)
    } catch (e: DivisionByZeroException) {
        0.0
    }

    println("the result of the division is $division")

    val input = try {
        readLine()?.toInt()
    }catch (e: NumberFormatException) {
        0
    } finally {
        println("This is from the finally block")
    }

}

class DivisionByZeroException :  Exception("The division of zero cannot exist, use a different number")

fun divide(a: Double, b: Double) : Double{
    if (b == 0.0) throw DivisionByZeroException()
    return a/b
}
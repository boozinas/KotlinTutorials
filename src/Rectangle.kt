import java.util.*
import kotlin.random.Random


class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle"){

    companion object {
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble(1.0, 30.0)
            val b = Random.nextDouble(1.0, 30.0)

            return Rectangle(a,b)
        }
    }
    constructor(a: Double) : this(a, a)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())
    init {
        println("${name} created with a $a and b $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}
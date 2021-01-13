import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle"){

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return  Circle(radius)
        }
    }

    init {
        println("this is a ${name} with ${radius} of radius")
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}
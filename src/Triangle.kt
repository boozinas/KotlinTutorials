import kotlin.math.sqrt

class Triangle (
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
        ): Shape("Triangle") {
   init {
       println("this is a ${name}")

   }
    override fun area(): Double {
        val p = perimeter()
        return sqrt((p/2) * ((p/2)-sideA) * ((p/2)-sideB) * ((p/2) - sideC))
    }
    override fun perimeter()= sideA + sideB + sideC
}
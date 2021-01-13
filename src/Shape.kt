 abstract class Shape(
    var name: String
) {

     constructor(name: String, vararg dimensions: Double): this(name)
   init {
       println("Im the superclass")
   }
    fun changeName(newName: String){
        name = newName
    }
    abstract fun area(): Double
    abstract fun perimeter(): Double
}
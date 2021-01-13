import java.util.*
import java.util.logging.Filter

fun main() {
    var list = (1..10).toList()

    val sum : Int = list.customSum { it % 2 == 1 }
    println(sum)
    // Generics
    var customTriple = CustomTriple<Int, String, Boolean>(5, "Hello", true)
    customTriple.printTypes()
}

fun <T> List<T>.customSum(filterFunction: (T) -> (Boolean)): List<T> {
    val list = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)){
           list.add(item)
        }
    }
    return  list
}

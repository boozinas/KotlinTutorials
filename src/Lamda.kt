import java.util.logging.Filter

fun main() {
   var list = (1..10).toList()

    // First Example
    // println(list)
    // list = list.filter { it % 2 == 0 }
    // println(list)

   // First Exercise
   val sum : Int = list.customSum { it % 2 == 1 }
   println(sum)
}

fun List<Int>.customSum(filterFunction: (Int) -> (Boolean)): Int {
   var sum : Int = 0
   for (item in this) {
      if (filterFunction(item)){
         sum += item
      }
   }
   return  sum
}
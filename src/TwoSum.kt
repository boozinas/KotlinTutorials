
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i+1 until nums.size) {
            var sum = nums[i] + nums[j]
            if(sum == target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf(0,0)
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    val items = HashMap<Int, Int>()
    for(i in nums.indices) {
       items[nums[i]] = i
    }
    println(items)
    for( j in nums.indices){
        val firstSearch = target - nums[j]
        if (items.containsKey(firstSearch) && items[firstSearch] != j)
            return intArrayOf(j, items.getValue(firstSearch))
        }
    return intArrayOf(0,0)
}

fun alternateListArray(list: List<Int>) {
    var end: Int = list.size - 1
    var start: Int = 0
    var flag = true
    println("Im a list")
    while (start <= end) {
        if (flag) {
            println(list[start].toString())
            start += 1
            flag = false
        }
        else if (start == end) {
            println(list[start].toString())
            start += 1
            end -=1
        }
        else {
            println(list[end].toString())
            end -= 1
            flag = true
        }
    }
}

fun alternateListArray(array: IntArray) {
    var end: Int = array.size - 1
    var start: Int = 0
    var flag = true
    println("Im an array")
    while (start <= end) {
        if (flag) {
            println(array[start].toString())
            start += 1
            flag = false
        }
        else if (start == end) {
            println(array[start].toString())
            start += 1
            end -=1
        }
        else {
            println(array[end].toString())
            end -= 1
            flag = true
        }
    }

}

fun main(args: Array<String>) {
    val twoSum = twoSum2(intArrayOf(3,3), 6)
    println("${twoSum[0]} and ${twoSum[1]}")

    val myRectangle = Rectangle(b = 55.0, a = 66.0)

    alternateListArray(listOf(1,2,3,4,5))
    alternateListArray(intArrayOf(1,2,3,4,5,6))
}

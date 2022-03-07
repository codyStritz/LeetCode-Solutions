fun main() {
    println(singleNumber(intArrayOf(1,1,2,2,3,4,4)))
}

fun singleNumber(nums: IntArray): Int = nums.reduce { acc, i -> acc.xor(i) }

// Also, same concept:
//fun singleNumber(nums: IntArray): Int {
//    var answer = 0
//    for (num in nums) {
//        answer = answer xor num
//    }
//    return answer
//}

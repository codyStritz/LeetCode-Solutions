import java.util.*

fun main() {
    val nums = intArrayOf(1,0,4,0,0,3,4,5)
    moveZeroes(nums)
    println(nums.contentToString())
}

fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    for (n in nums) {
        if (n != 0) {
            nums[index] = n
            index++
        }
    }
    for (i in index until nums.size) {
        nums[i] = 0
    }
}
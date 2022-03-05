fun main() {
    println(containsDuplicate(intArrayOf(1,2,3,4,4)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.size != nums.toSet().size
}

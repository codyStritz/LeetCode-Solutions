import java.util.*
import kotlin.collections.HashMap

fun main() {
    print(twoSum(intArrayOf(1, 2, 3, 4), 6).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val comp = target - nums[i]
        if (map.containsKey(comp)) {
            result[0] = map[comp]!!
            result[1] = i
        }
        map[nums[i]] = i
    }
    return result
}
package intersection_of_two_arrays_ii

fun main() {
    val answer = intersect(intArrayOf(1,2,2,1), intArrayOf(2,2))
    print(answer.contentToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val answer: MutableList<Int> = mutableListOf()
    for (num in nums1) {
        val freq = map.getOrDefault(num, 0)
        map[num] = freq + 1
    }
    for (num in nums2) {
        if (map.containsKey(num)) {
            if (map[num]!! > 0) {
                answer.add(num)
                val freq = map.getOrDefault(num, 0)
                map[num] = freq - 1
            }
            if (map[num]!! <= 0) map.remove(num)
        }
    }
    return answer.toIntArray()
}
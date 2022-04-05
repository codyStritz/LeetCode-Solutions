fun missingNumber(nums: IntArray): Int {
    val expected = (nums.size * (nums.size + 1))/2
    var actual = 0
    nums.forEach { actual += it }
    return expected - actual
}
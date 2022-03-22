fun main() {
    val s = charArrayOf('a', 'b', 'c', 'd')
    reverseString(s)
    println(s.contentToString())
}
fun reverseString(s: CharArray): Unit {
    for (i in 0 until s.size / 2) {
        val temp = s[i]
        val j = s.lastIndex - i
        s[i] = s[j]
        s[j] = temp
    }
}
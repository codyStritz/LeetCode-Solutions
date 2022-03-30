fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    val c = s.toLowerCase().filter { it.isLetterOrDigit() }
    var left = 0
    var right = c.lastIndex
    while (left < right) {
        if (c[left] != c[right]) return false
        left++
        right--
    }
    return true
}
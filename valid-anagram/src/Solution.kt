fun main() {
    println(isAnagram("car", "arc"))
}
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val sCount = IntArray(26)
    val tCount = IntArray(26)
    s.forEach { c -> sCount[c - 'a']++ }
    t.forEach { c -> tCount[c - 'a']++ }
    for (i in 0..25) {
        if (sCount[i] != tCount[i]) return false
    }
    return true
}
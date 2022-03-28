import java.nio.MappedByteBuffer

fun firstUniqChar(s: String): Int {
    val map = mutableMapOf<Char, Int>()
    val arr = s.toCharArray()
    for (c in arr) {
        map[c] = map.getOrDefault(c, 0) + 1
    }
    for (i in arr.indices) {
        if (map[arr[i]] == 1) return i
    }
    return -1
}
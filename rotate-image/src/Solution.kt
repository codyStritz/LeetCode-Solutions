import java.util.*

fun main() {
    val matrix = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )
    rotate(matrix)
    for (row in matrix) println(row.contentToString())
}
fun rotate(matrix: Array<IntArray>): Unit {
    // Transpose matrix -> swap(matrix[i][j], matrix[j][i])
    for (i in matrix.indices) {
        for (j in i until matrix.size) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
    // Flip matrix horizontally
    for (i in matrix.indices) {
        for (j in 0 until matrix.size/2) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][matrix.size - 1 - j]
            matrix[i][matrix.size - 1 - j] = temp
        }
    }
}
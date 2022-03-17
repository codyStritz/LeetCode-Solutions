fun isValidSudoku(board: Array<CharArray>): Boolean {
    val set = HashSet<String>()
    for (i in 0..8) {
        for (j in 0..8) {
            val number = board[i][j]
            if (number != '.') {
                if (!set.add("$number row $i") ||
                    !set.add("$number col $j") ||
                    !set.add("$number sec ${i/3}-${j/3}")) {
                    return false
                }
            }
        }
    }
    return true
}
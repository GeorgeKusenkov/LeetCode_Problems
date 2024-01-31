class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val firstWord = strs[0]
        for (i in firstWord.indices) {
            val char = firstWord[i]
            for (j in 1..<strs.size) {
                if (i == strs[j].length || strs[j][i] != char) {
                    return firstWord.substring(0, i)
                }
            }
        }
        return firstWord
    }
}

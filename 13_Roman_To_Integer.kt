class RomantoInteger {
    fun romanToInt(s: String): Int {
      var result = 0
        val romanToIntegerDictionary = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )
        for (i in s.indices) {
            val current = romanToIntegerDictionary.getValue(s[i])
            val nextInt = if (i + 1< s.length) romanToIntegerDictionary.getValue(s[i + 1]) else 0
            if (current < nextInt) {
                result -= current
            } else {
                result += current
            }
        }
        return result
    }
}

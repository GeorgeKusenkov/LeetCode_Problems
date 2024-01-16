class PalindromeNumber {
    fun isPalindromeSimple(x: Int): Boolean {
        val inputSting = x.toString()
        val reversedString = inputSting.reversed()
        val result = inputSting == reversedString
        return result
    }

    fun isPalindrome(x: Int): Boolean {
        var temp: Int
        var original = x
        var reverse = 0

        if (x < 0) return false

        while (original != 0) {
            temp = original%10
            reverse = reverse * 10 + temp
            original /= 10
        }
        return x == reverse
    }
}

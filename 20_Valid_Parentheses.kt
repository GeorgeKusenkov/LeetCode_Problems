class ValidParentheses {
    fun isValidStackSolution(s: String): Boolean {
        if (s.length % 2 != 0) {
            return false
        }
        val stack = mutableListOf<Char>()
        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.add(char)
                ')' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(') return false
                ']' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '[') return false
                '}' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '{') return false
            }
        }
        return stack.isEmpty()
    }

    fun isValidReplaceSolution(s: String): Boolean {
        var str = s
        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replace("()", "")
            str = str.replace("{}", "")
            str = str.replace("[]", "")
        }
        return str.isEmpty()
    }
}

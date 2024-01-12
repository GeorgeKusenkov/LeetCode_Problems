fun main() {
    val nums = intArrayOf(2,3,7,11)
    val target = 10
    val solution = Solution().twoSum(nums, target).contentToString()
    println(solution)
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val current = nums[i]
            val x = target - current
            if (map.contains(x)) {
                return intArrayOf(map[x]!!, i)
            } else {
                map[current] = i
            }
        }
        return intArrayOf()
    }
}

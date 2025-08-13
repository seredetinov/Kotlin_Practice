package LeetCode_75

class Solution_1431 {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val result = BooleanArray(candies.size,{false})
        for (i in 0 until candies.size){
            if (candies[i]+extraCandies>=max) result[i] = true
        }
        return result.toList()
    }
}

fun main() {
    val x = Solution_1431()
    print(x.kidsWithCandies(intArrayOf(12,1,12),10))
}

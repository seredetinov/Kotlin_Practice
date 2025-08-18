package LeetCode_75

class Solution_238 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val left = arrayOfNulls<Int>(size)
        left[0] = 1
        val right = arrayOfNulls<Int>(size)
        right[size-1] = 1

        for (i in 1 until size){
            left[i] = left[i-1]?.times(nums[i-1])
        }

        for (i in size-2 downTo 0){
            right[i] = right[i+1]?.times(nums[i+1])
        }

        for (i in 0 until size) {
            nums[i] = left[i]!!.times(right[i]!!)
        }

        return nums
    }
}

fun main() {
    val x = Solution_238()
    print(x.productExceptSelf(intArrayOf(-1,1,0,-3,3)))
}

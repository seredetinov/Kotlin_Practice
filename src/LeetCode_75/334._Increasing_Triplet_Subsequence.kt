package LeetCode_75

class Solution_334 {
    fun increasingTriplet(nums: IntArray): Boolean {
//        Решение с неоптимальной сложностью O(N^3)
//        fun checkTriplet(triplet: IntArray): Boolean {
//            if (triplet[0]<triplet[1] && triplet[1]<triplet[2]) return true else return false
//        }
//        for (i in 0 until nums.size-2){
//            for (j in i+1 until nums.size-1){
//                for (k in j+1 until nums.size){
//                    if (checkTriplet(intArrayOf(nums[i],nums[j],nums[k]))) return true
//                }
//            }
//        }
//        return false

        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE

        nums.forEach { num ->
            if (num<=first) first = num
            else if (num<=second) second = num
            else return true
        }
        return false
    }
}

fun main() {
    val x = Solution_334()
    print(x.increasingTriplet(intArrayOf(0,4,2,1,0,-1,-3)))
}

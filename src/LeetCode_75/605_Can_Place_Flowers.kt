package LeetCode_75

class Solution_605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        fun isFreeSlot(adjacentSlots: IntArray): Boolean {
            if (adjacentSlots[0]==0 && adjacentSlots[1]==0) return true else return false
        }
        fun maxNewPlants(flowerbed: IntArray): Int{
            var newPlants = 0
            for (i in 0 until flowerbed.size){
                if (flowerbed[i]==0){
                    if (i==0){
                        if (flowerbed[i+1]==0){
                            flowerbed[i]=1
                            newPlants++
                        }
                    }
                    else if (i == flowerbed.size-1){
                        if (flowerbed[i-1]==0){
                            flowerbed[i]=1
                            newPlants++
                        }
                    }
                    else {
                        if (isFreeSlot(intArrayOf(flowerbed[i-1],flowerbed[i+1]))) {
                            flowerbed[i]=1
                            newPlants++
                        }
                    }
                }
            }
            return newPlants
        }
        if(n==0) return true
        if (flowerbed.size == 1) if(flowerbed[0]==0) return true else return false
        return if (maxNewPlants(flowerbed)>=n) true else false
    }
}

fun main() {
    val x = Solution_605()
    print(x.canPlaceFlowers(intArrayOf(1,0,0,0,0,1),2))
}

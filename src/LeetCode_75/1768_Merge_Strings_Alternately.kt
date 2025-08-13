package LeetCode_75

class Solution_1768 {
    fun mergeAlternately(word1: String, word2: String): String {
        var word1 = word1
        var word2 = word2
        if (word1.length == 1) return  word1 + word2
        else if (word2.length == 1) return word1[0] + word2 + word1.substring(1)
        else {
            var result = ""
            while (word1.isNotEmpty() || word2.isNotEmpty()) {
                if (word1.isNotEmpty() && word2.isNotEmpty()){
                    result = result + word1[0] + word2[0]
                    word1 = word1.drop(1)
                    word2 = word2.drop(1)
                }
                else if(word1.isNotEmpty() && word2.isEmpty()){
                    result += word1[0]
                    word1 = word1.drop(1)
                }
                else {
                    result += word2[0]
                    word2 = word2.drop(1)
                }
            }
            return result
        }
    }
}

fun main(){
    val x = Solution_1768()
    print(x.mergeAlternately("abc","pqr"))
}


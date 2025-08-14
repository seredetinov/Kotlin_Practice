package LeetCode_75

class Solution_345 {
    fun reverseVowels(s: String): String {
        if (s.length==1) return s
        val sList = s.toList().toMutableList()
        val allVoewls = charArrayOf('a','e','i','o','u','A','E','I','O','U')
        val voewls = mutableListOf<Char>()

        for (i in 0 until sList.size){
            if (sList[i] in allVoewls){
                voewls.add(sList[i])
            }
        }
        voewls.reverse()

        var j = 0
        var result = ""
        for (i in 0 until sList.size){
            if (sList[i] in voewls){
                sList[i] = voewls[j]
                j++
                result += sList[i]
            }
            else {
                result += sList[i]
            }
        }
        return result
    }
}

fun main() {
    val x = Solution_345()
    print(x.reverseVowels("ao"))
}

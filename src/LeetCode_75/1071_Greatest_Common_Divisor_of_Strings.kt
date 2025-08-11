package LeetCode_75

class Solution_1071 {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1.length==str2.length) if (str1==str2) return str1 else return ""
        if (str1.length==1) if (str1.repeat(str2.length) == str2) return str1 else return ""
        if (str2.length==1) if (str2.repeat(str1.length) == str1) return str2 else return ""

        var t = ""
        var s = ""
        if (str1>str2) {
            s = str1
            t = str2
        }
        else {
            t = str1
            s = str2
        }

        var result = ""
        val sLength = s.length
        val tLength = t.length
        var x = ""
        for (i in t.length downTo 1){
            if (sLength%i==0 && tLength%i==0){
                for (j in 0 until t.length step i){
                    x = t.substring(j,j+i)
                    if (x.repeat(sLength/i)==s && x.repeat(tLength/i)==t){
                        return x
                    }
                }
            }
        }
        return result
    }
}

fun main(){
    val x = Solution_1071()
    print(x.gcdOfStrings("ABCABCABC","ABCAAA"))
}

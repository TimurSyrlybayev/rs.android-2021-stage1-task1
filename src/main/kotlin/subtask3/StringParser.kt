package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val map = mapOf("(" to ")", "<" to ">", "[" to "]")
        var list: Array<String> = arrayOf<String>()
        fun filterString(index: Int, key: Char) {
            var counter = 0
            for (j in  index + 1..inputString.length - 1) {
                if (inputString[j] == key) {
                    counter++
                } else if (inputString[j].toString() == map["$key"] && counter > 0) {
                    counter--
                } else if (inputString[j].toString() == map["$key"] && counter == 0) {
                    list += inputString.substring(index + 1, j)
                }
            }
        }
        for (i in 0..inputString.length - 1) {
            if (inputString[i] == '(' || inputString[i] == '<' || inputString[i] == '['){
                filterString(i, inputString[i])
            }
        }
        return list
    }
}

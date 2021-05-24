package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var flag = true
        var arrC = sadArray

        fun checkArray(arr: IntArray): IntArray {
            flag = false
            var arr1 = arr
            for (i in 1..arr.size - 2) {
                if(arr1[i - 1] + arr1[i + 1] < arr1[i]) {
                    arr1[i] = -1
                    flag = true
                }
            }

            arr1 = arr1.filter({it > 0}).toIntArray()
            arrC = arr1
            if(flag == true) {
                arrC = checkArray(arrC)
            }
            return arrC
        }

        return(checkArray(arrC))
    }
}

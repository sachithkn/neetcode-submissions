class MinStack() {
    var list = mutableListOf<Int>()
    var minList = mutableListOf<Int>()

    fun push(`val`: Int) {

        list.add(`val`)
        val currentMin = if (minList.isEmpty()) `val` else minOf(`val`, minList.last())
        minList.add(currentMin)
    }

    fun pop() {
        list.removeAt(list.size - 1)
        minList.removeAt(minList.size - 1)
    }

    fun top(): Int {
        return list.last()
    }

    fun getMin(): Int {
        return minList.last()
    }
}
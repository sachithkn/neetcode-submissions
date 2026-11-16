class TimeMap() {
    val map = mutableMapOf<String,TreeMap<Int,String>>()

    fun set(key: String, value: String, timestamp: Int) {
        val tree = map.getOrPut(key) { TreeMap() }
        tree[timestamp] = value
    }

    fun get(key: String, timestamp: Int): String {
        if(!map.contains(key)){
            return ""
        }
        val tMap = map[key]
        var res = tMap?.floorEntry(timestamp)
        if(res != null) {
            return res.value
        }
        return ""
    }
}

class TimeMap() {
    val map = mutableMapOf<String,TreeMap<Int,String>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key){TreeMap()}.put(timestamp,value)
    }

    fun get(key: String, timestamp: Int): String {
        var tree = map[key]
        if(tree != null){
            var res = tree.floorEntry(timestamp)
            if(res != null){
                return res.value
            }
        }
        return ""
    }
}
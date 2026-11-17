class TimeMap() {
    val map = mutableMapOf<String,TreeMap<Int,String>>()

    fun set(key: String, value: String, timestamp: Int) {
        val treeMap = map.getOrDefault(key,TreeMap())
        treeMap.put(timestamp,value)
        map[key] = treeMap
    }

    fun get(key: String, timestamp: Int): String {
        if(!map.contains(key)){
            return ""
        }
        val treeMap = map[key]
        if(treeMap != null ){
            val last = treeMap.floorEntry(timestamp)
            if(last != null){
                return last.value
            }
        }
        return ""
    }
}

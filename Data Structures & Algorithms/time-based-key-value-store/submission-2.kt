class TimeMap() {
    val map = mutableMapOf<String,MutableList<Pair<Int,String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        val list = map.getOrDefault(key,mutableListOf())
        list.add(Pair(timestamp,value))
        map[key] = list
    }

    fun get(key: String, timestamp: Int): String {
        val list = map[key]
        var result = ""
        if(list != null){
            var l = 0
            var r = list.size-1
            while(l<=r){
                var mid = l + ((r-l)/2)
                if(list.get(mid).first <= timestamp){
                    result = list.get(mid).second
                    l = mid + 1
                }else{
                    r = mid - 1
                }
            }
        }
        return result
    }
}
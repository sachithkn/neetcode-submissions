class TimeMap() {
    val map = mutableMapOf<String,MutableList<Pair<Int,String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key){mutableListOf()}.add(Pair(timestamp,value))
    }

    fun get(key: String, timestamp: Int): String {        
        var list = map[key]
        var res = ""
        if(list != null){
            var l = 0
            var r = list.size - 1
            while(l<=r){
                var mid = l + ((r-l)/2)
                if(list[mid].first <= timestamp){
                    res = list[mid].second
                    l = mid + 1
                }else{
                    r = mid - 1
                }
            }
        }
        return res
    }
}
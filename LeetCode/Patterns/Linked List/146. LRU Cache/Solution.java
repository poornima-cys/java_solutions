class LRUCache {
    int capacity;
    Map<Integer, Integer>hm=new LinkedHashMap<>(capacity,0.5f,true);
    public LRUCache(int capacity) {
        this.capacity=capacity;
        
    }
    
    public int get(int key) {
        if(hm.isEmpty()){
            return -1;
        }
       if(!hm.containsKey(key)){
        return -1;
       } 
       return hm.get(key);
    }
    
    public void put(int key, int value) {
        if(!hm.containsKey(key)){
            hm.put(key,value);
        }
        else{
            hm.remove(key);
            hm.put(key,value);
        }
        if(hm.size()>capacity){
            Iterator<Integer>itr=hm.keySet().iterator();
            itr.next();
            itr.remove();
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
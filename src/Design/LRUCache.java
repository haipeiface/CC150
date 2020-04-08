package Design;

import java.util.LinkedHashMap;

public class LRUCache {
    private LinkedHashMap<Integer,Integer> map;
    private int CAPACITY;
    public LRUCache(int capacity){
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){

        };
    }
}

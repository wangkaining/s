package Java1702;

import sun.awt.SunHints;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 王凯宁 on 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
        map.put(1,"a");
        map.put(3,"c");
        map.put(2,"b");
        map.put(4,"d");
        System.out.println(map.size());
        System.out.println(map.get(2));
        for (Integer integer : map.keySet()) {
            System.out.println(integer+">"+map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s+">"+map.get(s));
        }
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey());
        }
    }
}

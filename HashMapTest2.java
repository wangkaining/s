package Java1702;

import java.util.HashMap;

/**
 * Created by 王凯宁 on 2017/4/12.
 */
public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(100,"tom");
        map.put(1000,"tim");
        map.put(10000,"Bob");
        System.out.println(map.size());
        System.out.println(map.get(10000));
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }
        for (Integer integer : map.keySet()) {
            System.out.println(integer+"->"+map.get(integer));
        }
        for (String s : map.values()) {

        }

    }
}

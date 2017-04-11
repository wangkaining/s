package Java1702;

import java.util.Hashtable;

/**
 * Created by 王凯宁 on 2017/4/10.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String>hashtable=new Hashtable<>();
        hashtable.put(1,"a");
        hashtable.put(2,"d");
        hashtable.put(3,"c");
        hashtable.put(4,"d");
        hashtable.put(5,"d");
        hashtable.put(6,"d");
        hashtable.put(7,"d");
        hashtable.size();//键的数量
//        hashtable.remove(6);//按键清除
////        hashtable.clear();//清除所有
        hashtable.keySet();//建的集合
        System.out.println(hashtable.size());//输出键的个数
        System.out.println(hashtable.get(5));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));


        }





    }
}

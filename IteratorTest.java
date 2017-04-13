package Java1702;

import javax.swing.text.html.HTMLDocument;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by 王凯宁 on 2017/4/12.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String>iterator=list.iterator();
        while (iterator.hasNext()) {
//            String next =iterator.next();
            System.out.println(iterator.next());
        }
        TreeSet<String>set=new TreeSet<>();
        set.add("b");
        set.add("a");
        Iterator<String>iterator1=set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"bd");
        Iterator<Integer>iterator2=map.keySet().iterator();
        while (iterator2.hasNext()) {
            int next = iterator2.next();
            System.out.println(next+" > " +map.get(next));
        }
    }
}

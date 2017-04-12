package Java1702;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class HashSetTest {// 无序   Set 不能有重复元素
    public static void main(String[] args) {
        HashSet<String>strings=new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("set");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

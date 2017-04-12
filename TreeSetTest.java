package Java1702;

import java.util.TreeSet;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class TreeSetTest { //按元素值排序
    public static void main(String[] args) {
        TreeSet<String>strings=new TreeSet<>();
        strings.add("a");
        strings.add("d");
        strings.add("c");
        strings.add("e");
        strings.add("b");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

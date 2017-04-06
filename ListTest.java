package Java1702;

import java.util.ArrayList;

/**
 * Created by 王凯宁 on 2017/3/31.
 */
public class ListTest {
    public static void main(String[] args) {
        //array  数组
        // list 列表
        ArrayList<String>strings=new ArrayList<String>();
        strings.add("hi");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println();

    }
}

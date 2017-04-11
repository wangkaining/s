package Java1702;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class LinkedListTest {
    public static void main(String[] args) {
       LinkedList<String>strings=new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings.size());//一共有多少
        System.out.println("---------");
        System.out.println(strings.get(2));//选取第几个
        System.out.println("---------");
        for (String string : strings) {//iter 迭代
            System.out.println(string);
        }
        System.out.println("--------------");
        System.out.println(strings.getFirst());// getFirst 调用第一个
        System.out.println(strings.getLast() );//getLast 调用最后一个
    }
}

package Java1702;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class ArrayListOne {
    public static void main(String[] args) {
        List<String>strings=new ArrayList<>();
        strings.add("a");
        strings.add("b");
        List<String>strings1=new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        strings1.add("c");
        System.out.println(strings.equals(strings1));//equals  相等于
        List<String>strings2=new ArrayList<>(strings1.subList(1,3));// 1 是去除 后面的3是 到哪个字符
        System.out.println(strings2);
        System.out.println(strings1.containsAll(strings2));//containsAll  方法
        strings1.removeAll(strings2);// removeAll 删除 strings1 删除 strings2
        System.out.println(strings1);
        strings1.retainAll(strings2);//retainAll  仅保留的意思
        System.out.println(strings1);
    }
}

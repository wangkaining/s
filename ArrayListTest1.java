package Java1702;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.util.*;

/**
 * Created by 王凯宁 on 2017/4/10.
 */
public class ArrayListTest1 extends ArrayListTest{
    public static void main(String[] args) {
        java.util.List<String>strings=new ArrayList<>();//引入字符型
        strings.add("HI");//集合引入单个元素用add
        strings.add("hello");//集合引入单个元素用add
        strings.add("test1");//集合引入单个元素用add
        strings.add("test2");//集合引入单个元素用add
        strings.addAll(2,strings);//引入上面所有元素
//        strings.clear();//删除上面全部元素
        System.out.println("-----");
//        strings.remove(0);//删除数组下标0位置的元素
        System.out.println(strings.size());//当前框架共多少元素
        System.out.println("-----");
        System.out.println(strings.get(0));//当前下标位置元素值
        System.out.println("---------");
        for (String string : strings) {// for循环快捷键iter
            System.out.println(string);
            System.out.println("-----");
        }
        System.out.println(strings.contains("test1" ));//boolean类型判断里面有没有值是这个，结果为true
        System.out.println(strings.containsAll(strings));//boolean类型判断里面是不是字符类型，结果为true
        System.out.println(strings.indexOf("test1"));//当前元素在数组下标的位置
        System.out.println(strings.isEmpty());//判断是否为空，结果为false
        System.out.println(strings.lastIndexOf("test1"));//判断当前元素在数组下标中最后的数组下标为几
        //当前下标1为“test1”后面5也为“test1”所以输出结果为5


    }

}

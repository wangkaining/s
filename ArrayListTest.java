package Java1702;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.awt.*;
import java.util.*;

/**
 * Created by 王凯宁 on 2017/4/10.
 */
public class ArrayListTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        java.util.List<String>list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        System.out.println(list.size());
        System.out.println(list.get(0));
        for (String s : list) { //iter 增强for循环
            System.out.println(s);
        }

    }

        }
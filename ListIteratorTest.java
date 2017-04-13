package Java1702;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 王凯宁 on 2017/4/12.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String>strings=new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println(strings.size());
        System.out.println("********************");
        ListIterator<String>listIterator=strings.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex());
            String next = listIterator.next();
            System.out.println(next);
            listIterator.add("g");

//            listIterator.next();
//            listIterator.set("b");
//            listIterator.previous();
        }

        //next // 正常输出
        //prve // 反着输出
        //index // 索引
        //add // 添加元素
        //set  //  可以修改元素
        //remove //删除当前编译的元素
        //reverse // 异序
        //sort  排序
//        System.out.println(strings.size());
//        System.out.println(strings.get(2));
//        listIterator.add("a");
//        listIterator.add("b");
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.previous());
//        System.out.println(listIterator.previousIndex());
    }


}

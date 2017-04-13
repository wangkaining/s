package Java1702;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by 王凯宁 on 2017/4/12.
 * 1) 创建一个List，在List 中增加三个工人，
 * 基本信息如下： 姓名 年龄 工资
 * zhang3 18 3000 li4 25 3500 wang5 22 3200
 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 * 3) 删除wang5 的信息
 * 4) 利用for 循环遍历，打印List 中所有工人的信息
 * 5) 利用迭代遍历，对List 中所有的工人调用work 方法。
 * 6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
 */
public class E3 {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("zhang3",18);
        map.put("li4",25);
        map.put("wang5",22);


    }
}

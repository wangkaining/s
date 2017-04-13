package Java1702;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

import java.util.LinkedHashMap;

/**
 * Created by 王凯宁 on 2017/4/12.
 * 使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
 添加几条信息
 列出所有的员工姓名
 列出所有员工姓名及其工资
 删除名叫 Tom 的员工信息
 输出 Jack 的工资，并将其工资改为 1500 元
 将所有工资低于 1000 元的员工的工资上涨 20%
 */
public class E2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        map.put("Tom",2000);
        map.put("Jack",3000);
        map.put("Bob",1500);
        map.put("Tim",800);
        System.out.println(map.remove("Tom",2000));
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        System.out.println("********************************");
        System.out.println("删除完Tom剩下的人数");
        System.out.println(map.size());
        System.out.println("********************************");
        for (String s : map.keySet()) {
            System.out.println(s+"的工资->"+map.get(s));
        }
        System.out.println("********************************");

        System.out.println("Jack的工资是"+"->"+map.get("Jack"));
        map.put("Jack",1500);
        System.out.println(map.get("Jack"));
        for (String s : map.keySet()) {
            if (map.get(s) < 1000) {
                map.put(s,(int)(map.get(s)*1.2));

            }
        }System.out.println(map);

    }

}
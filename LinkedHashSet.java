package Java1702;

/**
 * Created by 王凯宁 on 2017/4/11.
 */
public class LinkedHashSet { // 有序输出  按输入的顺序 有序 输出
    public static void main(String[] args) {
        java.util.LinkedHashSet<String>strings=new java.util.LinkedHashSet<>();
        strings.add("s");
        strings.add("d");
        strings.add("a");
        strings.add("v");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

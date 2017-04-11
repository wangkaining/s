package Java1702;

/**
 * Created by 王凯宁 on 2017/4/7.
 */
public class ArrayTest {
//    public static void main(String[] args) {
//        int[] a = new int[10];
//        System.out.println(a[10]);
//        for (int i = 0; i <10 ; i++) {
//            a[i]=i;
////            System.out.println(a[i]);
//
//        }
//        //itar + Tab  快捷键
//        for (int i = 0; i < a.length; i++) {
//            int i1 = a[i];
//            System.out.println();
//
//        }
//        //iter +Tab 快捷键 强化FOR 循环
//        // for -  each    循环
//        for (int i : a) {
//
//        }
//    }

    public static void main(String[] args) {
        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i * j + "";
            }
        }
        System.out.println(strings[strings.length - 1][strings[strings.length - 1].length - 1]);
    }
}

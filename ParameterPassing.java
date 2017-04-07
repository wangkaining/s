package Java1702;

/**
 * Created by 王凯宁 on 2017/4/7.
 */
public class ParameterPassing {
//    public static void Test(int x) {
//        System.out.println("a"+x);
//        x++;
//        System.out.println("b"+x);
//    }
//
//    public static void main(String[] args) {
//        int x = 0;
//        System.out.println("c"+x);
//        Test(x);
//        System.out.println("d"+x);
//    }
    public static void st(String a){
        a = "你好";
        System.out.println("a"+a);

    }

    public static void main(String[] args) {
        String b ="再见";
        System.out.println("b"+b);
        st(b);
        System.out.println("c"+b);
    }
}

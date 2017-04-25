package Java1702;

/**
 * Created by 王凯宁 on 2017/4/17.
 */
public class TestECCL {
    public static void main(String[] args) { //异常  例外
        try { //Alt +Ctrl + t
            System.out.println("hello".charAt(3));//String index out of range: 5 下标越界
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println((new int[]{1,2,3})[2]);
        System.out.println(1/1);//java.lang.ArithmeticException: / by zero Java中 被除数不能为0
//        System.out.println(Integer.valueOf("123"));
        String s = "hello";
//        System.out.println("test...");
        s=null;
        System.out.println(s.toUpperCase());//转换为大写
        //toLowerCase()  转换为小写
    }
}

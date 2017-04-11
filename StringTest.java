package Java1702;

/**
 * Created by 王凯宁 on 2017/4/7.
 */
public class StringTest {
    /**
     * @param args 主方法的参数数组
     * @author tester
     */
    public static void main(String[] args) {
        String s = "hi";
        System.out.println(s);
        s = "hello";
        System.out.println(s);

        // GC Garbage Collection 垃圾回收机制
        byte[] bytes = new byte[10];
        String s1 = ""; // deprecated 弃用\ [ˈdeprəkeɪtɪd]
        System.out.println("-" + s1 + "-");
        String s2 = "test...";
        String s3 = "test...";
//        String s3 = new String("test...");
        System.out.println(s2 == s3);
        System.out.println("hello".charAt(4));
        System.out.println("hello".concat("s"));
        System.out.println("hi".contains("1"));
        System.out.println("hi".endsWith("i"));
        System.out.println("hi".equals("hi"));
//        System.out.println("hi".equalsIgnoreCase());
        System.out.println("hi".indexOf("i"));
        System.out.println("hi".lastIndexOf("h"));

        /*
        String Pool 字符串池
        "test..."
         */
    }
}

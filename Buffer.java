package Java1702;

import Day1.Hello;

/**
 * Created by 王凯宁 on 2017/4/8.
 */
public class Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5, 6));//ctrl + q
        System.out.println(stringBuffer.insert(5, ','));
        System.out.println(stringBuffer.insert(stringBuffer.length(), '!'));
        System.out.println(stringBuffer.reverse());
        System.out.println(String.valueOf(new char[]{'t', 'e', 's', 't'}));
        System.out.println("   test1 hello     ".trim());
        System.out.println("Hello".toUpperCase());
        System.out.println("Hello".toLowerCase());

    }
}
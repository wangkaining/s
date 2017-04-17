package Java1702;

import java.security.Key;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by 王凯宁 on 2017/4/12.
 */
public class ArraysTest {
    public static void main(String[] args) {
        String[]strings={"a","b","c","d","e"};
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.binarySearch(strings,"c"));
        String[]strings1=Arrays.copyOf(strings,5);
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(Arrays.copyOfRange(strings,1 ,3)));
        Arrays .sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);
    }
}

package Java1702;

/**
 * Created by 王凯宁 on 2017/4/6.
 */
public class TestStatic {
    int i;
    static int j ;

}

class Test1 {
    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
//        testStatic.i=1;
        TestStatic.j = 1;
        System.out.println(testStatic.j);
        TestStatic testStatic1 = new TestStatic();
//        testStatic1.i=2;
//        TestStatic.j=2;
        System.out.println(testStatic1.j);
    }
}

package Java1702;

/**
 * Created by 王凯宁 on 2017/4/3.
 */
public class Text01 {
    public int tuzi(int n ) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
          return tuzi(n-2)+tuzi(n-1);
        }

    }

    public static void main(String[] args) {
        Text01 text01 =new Text01();
        System.out.println(text01.tuzi(9));
    }
}

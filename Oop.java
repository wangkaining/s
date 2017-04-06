package Java1702;

/**
 * Created by 王凯宁 on 2017/4/1.
 */
// 类=域+方法  //class=fields+methods
public class Oop {
    //域
    private String name;//姓名
    private char gender;//性别
    private int age;//年龄
    private double height;//身高
    private double weight;//体重
    //方法


    public void study(String study) { //（）两种参数 1 ：形参 2：实参 形参是没有具体意义的是形参  实参有具体的参数或者意义的时候是实参
        System.out.println("学习了多长时间"+study);
    }

    public Oop(String name, char gender, int age, double height, double weight) {//快捷键是alt+ shift + insert  构造方法
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Oop oop =new Oop("Bob",'M',25,1.7,55);
        System.out.println(oop.name);
        System.out.println(oop.gender);
        System.out.println(oop.age);
        System.out.println(oop.height);
        System.out.println(oop.weight);

    }
}

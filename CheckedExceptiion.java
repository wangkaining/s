package Java1702;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * Created by 王凯宁 on 2017/4/18.
 */
public class CheckedExceptiion {
    public static void main(String[] args) {
        // 抽取方法  extract method  ctrl +alt + m
        test();
    }
    private static void test() {
        System.out.println("input a file name");
        Scanner scanner = new Scanner(System.in);
        String fileName =scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("file","r");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.err.println("file not found!");
            test(); // recursive  递归

        }
    }
}

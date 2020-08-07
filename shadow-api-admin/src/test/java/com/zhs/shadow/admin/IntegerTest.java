package com.zhs.shadow.admin;

/**
 * @author : 12038
 * @date :Created in 2019/12/26 16:43
 * @description:
 * @modifiedBy :
 * @version:
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;

        change(a, b);

        System.out.println("main a:" + a);
        System.out.println("main b:" + b);
    }

    private static void change(Integer a, Integer b) {
        a++;
        b++;
        System.out.println("change a:" + a);
        System.out.println("change b:" + b);
    }

}

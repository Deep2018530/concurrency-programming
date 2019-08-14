package com.deepz.code.chapter1.t3;

/**
 * created by zhangdingping on 2019/8/14
 */
public class Run {

    public static void main(String[] args) {

        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}

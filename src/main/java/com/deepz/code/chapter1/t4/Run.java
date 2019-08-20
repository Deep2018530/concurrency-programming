package com.deepz.code.chapter1.t4;

/**
 * created by zhangdingping on 2019/8/14
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

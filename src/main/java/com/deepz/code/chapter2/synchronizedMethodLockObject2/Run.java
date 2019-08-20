package com.deepz.code.chapter2.synchronizedMethodLockObject2;

/**
 * created by zhangdingping on 2019/8/20
 */
public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        a.setName("B");
        a.start();
        b.start();
    }
}

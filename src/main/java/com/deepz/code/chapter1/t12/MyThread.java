package com.deepz.code.chapter1.t12;

/**
 * created by zhangdingping on 2019/8/16
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}

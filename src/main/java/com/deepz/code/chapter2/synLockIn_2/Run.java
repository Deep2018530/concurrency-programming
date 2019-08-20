package com.deepz.code.chapter2.synLockIn_2;

/**
 * created by zhangdingping on 2019/8/20
 */
public class Run {

    public static void main(String[] args) {

        new Thread(() -> {
            Sub sub = new Sub();
            sub.operateISubMethod();
        }).start();
    }
}

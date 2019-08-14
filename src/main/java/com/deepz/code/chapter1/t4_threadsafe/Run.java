package com.deepz.code.chapter1.t4_threadsafe;

/**
 * created by zhangdingping on 2019/8/15
 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();

        BLogin b = new BLogin();
        b.start();
    }
}

package com.deepz.code.chapter2.synLockIn_1;

/**
 * created by zhangdingping on 2019/8/20
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}

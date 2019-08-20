package com.deepz.code.chapter2.synchronizedMethodLockObject2;

/**
 * created by zhangdingping on 2019/8/20
 */
public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

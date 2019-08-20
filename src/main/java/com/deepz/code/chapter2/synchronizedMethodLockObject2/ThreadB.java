package com.deepz.code.chapter2.synchronizedMethodLockObject2;

/**
 * created by zhangdingping on 2019/8/20
 */
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}

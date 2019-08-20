package com.deepz.code.chapter2.t3;

/**
 * created by zhangdingping on 2019/8/20
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}

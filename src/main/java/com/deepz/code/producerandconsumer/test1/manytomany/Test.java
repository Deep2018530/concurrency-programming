package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        SetService setService = new SetService(box);
        for (int i = 0; i < 2; i++) {
            SetValueThread setValueThread = new SetValueThread(setService);
            setValueThread.start();
        }

        Thread.sleep(50);
        SetCheckThread setCheckThread = new SetCheckThread(setService);
        setCheckThread.start();

        Thread.sleep(10000);

        GetService getService = new GetService(box);
        for (int i = 0; i < 10; i++) {
            GetValueThread getValueThread = new GetValueThread(getService);
            getValueThread.start();
        }
        Thread.sleep(50);
        GetCheckThread getCheckThread = new GetCheckThread(getService);
        getCheckThread.start();

    }
}

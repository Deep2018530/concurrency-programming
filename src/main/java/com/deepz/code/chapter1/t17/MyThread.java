package com.deepz.code.chapter1.t17;

/**
 * created by zhangdingping on 2019/8/16
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
    }

    //放弃当前的CPU资源，让其他任务去占用CPU执行时间，放弃的时间不确定，有可能刚刚放弃，马上又获得CPU时间片。
}

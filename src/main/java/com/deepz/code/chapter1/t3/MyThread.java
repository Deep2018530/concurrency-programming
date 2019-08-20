package com.deepz.code.chapter1.t3;

/**
 * created by zhangdingping on 2019/8/14{}
 * 多线程对数据共享问题的讨论
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + currentThread().getName() + " 计算, count=" + count);
        }
    }

}

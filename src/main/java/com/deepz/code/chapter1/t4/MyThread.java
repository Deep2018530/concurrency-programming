package com.deepz.code.chapter1.t4;

/**
 * created by zhangdingping on 2019/8/14
 * 变量共享情况-投票功能多线程
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        //此示例不要用while语句，会造成其他线程得不到运行的机会
        //因为第一个执行while语句的线程会将count值减到0
        //一直由一个线程进行减法运算
        System.out.println("由 " + currentThread().getName() + " 计算,count = " + count);
    }
}

package com.deepz.code.chapter1.t12;

/**
 * created by zhangdingping on 2019/8/16
 */
public class Run1 {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? = " + thread.isInterrupted());
            System.out.println("是否停止2? = " + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end!");

    }
}

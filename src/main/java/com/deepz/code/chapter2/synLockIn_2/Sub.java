package com.deepz.code.chapter2.synLockIn_2;

/**
 * created by zhangdingping on 2019/8/20
 */
public class Sub extends Main {

    synchronized public void operateISubMethod() {

        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i= " + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

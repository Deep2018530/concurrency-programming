package com.deepz.code.chapter2.synLockIn_1;

/**
 * created by zhangdingping on 2019/8/20
 */
public class Service {

    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service3");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }
}

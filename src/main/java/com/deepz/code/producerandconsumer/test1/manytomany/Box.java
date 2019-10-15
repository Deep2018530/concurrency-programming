package com.deepz.code.producerandconsumer.test1.manytomany;

import java.util.ArrayList;
import java.util.List;

/**
 * created by zhangdingping at 2019/10/15
 */
public class Box {
    private static List list = new ArrayList();

    synchronized public void add() {
        if (size() < 50) {
            list.add("anyString");
            System.out.println("线程：" + Thread.currentThread().getName() + "执行add()方法,size大小为：" + size());
        }
    }

    synchronized public int size() {
        return list.size();
    }

    synchronized public Object popFirst() {
        Object value = list.remove(0);
        System.out.println("线程: " + Thread.currentThread().getName() + "执行popFirst()方法,size大小为: " + size());
        return value;
    }
}

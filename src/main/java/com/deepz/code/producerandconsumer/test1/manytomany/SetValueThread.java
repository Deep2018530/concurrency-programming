package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 * 生产者线程类代码
 */
public class SetValueThread extends Thread {
    private SetService service;

    public SetValueThread(SetService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.setMethod();
        }
    }
}

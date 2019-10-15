package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 * 生产者容器大小测试类
 */
public class SetCheckThread extends Thread {
    private SetService service;

    public SetCheckThread(SetService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.checkBoxStatus();
    }
}

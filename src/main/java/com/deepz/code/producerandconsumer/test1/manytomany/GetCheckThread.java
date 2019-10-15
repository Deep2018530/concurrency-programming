package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 * 消费者容器大小测试类
 */
public class GetCheckThread extends Thread {

    private GetService service;

    public GetCheckThread(GetService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.checkBoxStatus();
    }
}

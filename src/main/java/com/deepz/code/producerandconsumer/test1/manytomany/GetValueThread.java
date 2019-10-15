package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 */
public class GetValueThread extends Thread {
    private GetService service;

    public GetValueThread(GetService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.getMethod();
        }
    }
}

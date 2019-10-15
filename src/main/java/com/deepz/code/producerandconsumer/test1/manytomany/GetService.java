package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 * 消费者业务类
 */
public class GetService {
    private Box box;

    public GetService(Box box) {
        super();
        this.box = box;
    }

    public void getMethod() {
        try {
            synchronized (this) {
                while (box.size() == 0) {
                    System.out.println("----------");
                    this.wait();
                }
                box.popFirst();
            }
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBoxStatus() {
        try {
            while (true) {
                synchronized (this) {
                    if (box.size() > 0) {
                        this.notifyAll();
                    }
                }
                System.out.println("get checkboxBox = " + box.size());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

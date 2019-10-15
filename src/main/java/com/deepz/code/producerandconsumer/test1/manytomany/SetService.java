package com.deepz.code.producerandconsumer.test1.manytomany;

/**
 * created by zhangdingping at 2019/10/15
 * 生产者业务
 */
public class SetService {
    private Box box;

    public SetService(Box box) {
        super();
        this.box = box;
    }

    public void setMethod() {
        try {
            synchronized (this) {
                while (box.size() == 50) {
                    System.out.println("··········");
                    this.wait();
                }
            }
            Thread.sleep(300);
            box.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBoxStatus() {
        try {
            while (true) {
                synchronized (this) {
                    if (box.size() < 50) {
                        this.notifyAll();
                    }
                }
                System.out.println("set checkboxBox = " + box.size());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

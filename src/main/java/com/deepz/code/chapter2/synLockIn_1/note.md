

#### synchronized锁重入

```java

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

/**
 * created by zhangdingping on 2019/8/20
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}

/**
 * created by zhangdingping on 2019/8/20
 */
public class Run {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}


```
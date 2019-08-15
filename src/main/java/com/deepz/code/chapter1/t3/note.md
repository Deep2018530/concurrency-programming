
## 数据不共享情况

> 该程序一共创建了3个线程，每个线程都有各自的count变量，自己自减自己的count变量
所以这样的情况就是变量不共享。

```java
/**
 * created by zhangdingping on 2019/8/14{}
 * 多线程对数据共享问题的讨论
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + currentThread().getName() + " 计算, count=" + count);
        }
    }

}


/**
 * created by zhangdingping on 2019/8/14
 */
public class Run {

    public static void main(String[] args) {

        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}

```
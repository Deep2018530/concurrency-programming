
## 守护线程

Java中有两种线程：一种是用户线程，也称非守护线程;另一种是守护线程。

什么是守护线程？守护线程是一种特殊的线程，当进程中不存在非守护线程了，则守护线程自动销毁。
典型的守护线程是垃圾回收线程,当进程中没有非守护线程了，则垃圾回收线程也就没有存在的必要了,自动销毁。

> 这个例子，主线程相当于**用户线程** 所以当输出完那句话后，主线程结束了，那么守护线程也会自动销毁，就不会继续死循环打印下去了。

> 注意要在start()方法之前执行设置守护线程的方法。

```java

/**
 * created by zhangdingping on 2019/8/16
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * created by zhangdingping on 2019/8/16
 */
public class Run {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

```
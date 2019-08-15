## 数据共享情况

> 多个线程同时对count进行处理，会产生"非线程安全"问题。

* 出现非线程安全的情况是因为在某些JVM中，count--的操作要分为如下3步(执行这3个步骤的过程会被其他线程所打断)

1. 取得原有count值
2. 计算count-1
3. 对count进行赋值

其实这个实例就是典型的销售场景，5个销售员，每个销售员卖出一个货品后不可以得出相同的剩余数量....


> 将run方法前面加上锁关键字 **synchronized** 问题就迎刃而解了

```java

/**
 * created by zhangdingping on 2019/8/14
 * 变量共享情况-投票功能多线程
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        //此示例不要用while语句，会造成其他线程得不到运行的机会
        //因为第一个执行while语句的线程会将count值减到0
        //一直由一个线程进行减法运算
        System.out.println("由 " + currentThread().getName() + " 计算,count = " + count);
    }
}

/**
 * created by zhangdingping on 2019/8/14
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}


```
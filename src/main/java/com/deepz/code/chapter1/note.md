
> 留意i--与System.out.println()出现的非线程安全问题

虽然println()方法在内部是同步的，但i--的操作是在进入println()之前发生的，所以发生费非线程安全问题仍有一定的概率。

> currentThread()方法

currentThread()方法可返回代码段正在被哪个线程调用。

> isAlive()方法

测试线程是否处于活动状态。线程已经启动且尚未终止的状态即是活动状态。如果线程处于正在运行或准备开始运行的状态就认为线程是"存活"的。

> static Map<Thread,StackTraceElement[]> getAllStackTraces()

> 如果连续两次调用Thread.interrupted()方法，则第二次调用将返回false(在第一次调用已清除了其中断状态之后，且第二次调用检验完中断状态前，当前线程再次中断的情况除外)。

> 线程中断后后续方法可能还会运行，解决办法有如下：

* 抛异常

* 配合sleep() 抛异常

* stop()

* return;

> 线程优先级的继承特性
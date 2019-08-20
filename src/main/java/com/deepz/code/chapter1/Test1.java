package com.deepz.code.chapter1;

/**
 * created by zhangdingping on 2019/8/15
 */
public class Test1 {

    public void a() {
        b();
    }

    private void b() {
        c();
    }

    private void c() {
        d();
    }

    private void d() {
        e();
    }

    private void e() {
        StackTraceElement[] array = Thread.currentThread().getStackTrace();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                StackTraceElement element = array[i];
                System.out.println("className=" + element.getClassName() + "methodName=" + element.getMethodName() + "fileName=" + element.getFileName() + "lineNumber=" + element.getLineNumber());

            }
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.a();
    }

    //返回一个表示该线程堆栈跟踪元素数组。如果该线程尚未启动或已经终止，则该方法将返回一个零长度数组。如果返回
    //的数组不是零长度，则其第一个元素代表堆栈顶，它是该数组中最新的方法调用。最后一个元素代表堆栈底，是该数组中最旧的方法调用。
}

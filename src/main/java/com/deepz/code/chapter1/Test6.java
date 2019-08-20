package com.deepz.code.chapter1;

/**
 * created by zhangdingping on 2019/8/16
 */
public class Test6 {

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
        int age = 0;
        age = 100;
        if (age == 100) {
            Thread.dumpStack();
        }
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.a();
    }
}

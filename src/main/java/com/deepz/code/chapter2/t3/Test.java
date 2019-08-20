package com.deepz.code.chapter2.t3;

/**
 * created by zhangdingping on 2019/8/20
 */
public class Test {

    public static void main(String[] args) {

        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200); //输出结果受此值大小影响

            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

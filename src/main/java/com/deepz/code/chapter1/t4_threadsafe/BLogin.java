package com.deepz.code.chapter1.t4_threadsafe;

/**
 * created by zhangdingping on 2019/8/15
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}

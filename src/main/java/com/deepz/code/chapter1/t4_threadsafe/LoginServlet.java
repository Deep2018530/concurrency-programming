package com.deepz.code.chapter1.t4_threadsafe;

/**
 * created by zhangdingping on 2019/8/14
 * Servlet技术造成的非线程安全问题
 */
public class LoginServlet {

    private static String usernameRef;

    private static String passwordRef;

    public static void doPost(String username, String password) {

        try {
            usernameRef = username;
            if (("a").equals(username)) {
                Thread.sleep(5000);
            }

            passwordRef = password;

            System.out.println("username=" + usernameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

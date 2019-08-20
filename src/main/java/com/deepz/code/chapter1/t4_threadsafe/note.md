
## Servlet技术造成的非线程安全问题

案例结果：
username = b password = bb
username = b password = aa

因为a先start，大大加大了a先执行代码的几率
a进入方法后，"a"赋值给usernameRef,进入if判断，等待5秒，
此时b进入后将"b"赋值给usernameRef(这样就覆盖了a的赋值),随后b正常将"bb"赋值给passwordRef
并输出二者的值。此时Servlet中的变量值分别是 b bb
之后，a睡眠结束，将"aa"赋值给passwordRef(覆盖了bb)，并输出二者的值，此时二者的值分别是 b aa

所以就有了上面展示的输出结果。

解决办法：
在doPost()前面使用"synchronized"关键字修饰即可

```java

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

/**
 * created by zhangdingping on 2019/8/15
 */
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}

/**
 * created by zhangdingping on 2019/8/15
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}

/**
 * created by zhangdingping on 2019/8/15
 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();

        BLogin b = new BLogin();
        b.start();
    }
}


```
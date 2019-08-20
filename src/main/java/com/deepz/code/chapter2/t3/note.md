

#### 脏读
```java

/**
 * created by zhangdingping on 2019/8/20
 */
public class PublicVar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {

        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username= " + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username= " + username + " password= " + password);
    }

}

/**
 * created by zhangdingping on 2019/8/20
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}

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

```

`运行结果` 

getValue method thread name=main username= B password= AA   
setValue method thread name=Thread-0 username= B password=BB

解决办法：
```java

synchronized public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username= " + username + " password= " + password);
    }
```
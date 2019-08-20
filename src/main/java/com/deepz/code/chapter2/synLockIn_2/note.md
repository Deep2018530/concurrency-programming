

## 锁重入支持继承的环境

```java


/**
 * created by zhangdingping on 2019/8/20
 */
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod() {

        try {
            i--;
            System.out.println("main print i= " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * created by zhangdingping on 2019/8/20
 */
public class Sub extends Main {

    synchronized public void operateISubMethod() {

        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i= " + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/**
 * created by zhangdingping on 2019/8/20
 */
public class Run {

    public static void main(String[] args) {

        new Thread(() -> {
            Sub sub = new Sub();
            sub.operateISubMethod();
        }).start();
    }
}

```
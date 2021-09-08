package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ObserverTest
 * @Description
 * @Author xsir
 * @Date 2021/8/1 下午3:52
 * @Version V1.0
 */
public class ObserverTest {



    static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        System.out.println("start ...");
        t1();
        System.out.println("end ...");
    }

    public static void t1(){

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    t2(finalI);
                }
            });
        }

    }

    public static void t2(int i){
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

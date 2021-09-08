package obverser;

/**
 * @ClassName Client
 * @Description
 * @Author xsir
 * @Date 2021/8/1 下午4:12
 * @Version V1.0
 */
public class Client {

    public static void main(String[] args) {
        EntityDemo demo = new EntityDemo();
        ObserverTest observerTest = new ObserverTest();
        demo.addObserver(observerTest);
        demo.setAge(12);
        demo.setAge(15);
    }

}

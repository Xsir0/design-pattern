package obverser;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ObserverTest
 * @Description
 * @Author xsir
 * @Date 2021/8/1 下午4:11
 * @Version V1.0
 */
public class ObserverTest implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("get change: "+arg);
    }
}

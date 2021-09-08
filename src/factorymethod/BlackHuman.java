package factorymethod;

/**
 * @ClassName BlackHuman
 * @Description
 * @Author xsir
 * @Date 2021/7/23 上午6:28
 * @Version V1.0
 */
public class BlackHuman implements Human {
    @Override
    public void skin() {
        System.out.println("黑人黑皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑热语言");
    }
}

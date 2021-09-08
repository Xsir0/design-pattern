package factorymethod;

/**
 * @ClassName YellowHuman
 * @Description
 * @Author xsir
 * @Date 2021/7/23 上午6:28
 * @Version V1.0
 */
public class YellowHuman implements Human {
    @Override
    public void skin() {
        System.out.println("黄种人黄皮肤");
    }

    @Override
    public void talk() {
        System.out.println("东亚语言");
    }
}

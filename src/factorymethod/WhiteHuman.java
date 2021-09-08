package factorymethod;

/**
 * @ClassName WhiteHuman
 * @Description
 * @Author xsir
 * @Date 2021/7/23 上午6:29
 * @Version V1.0
 */
public class WhiteHuman implements Human {
    @Override
    public void skin() {
        System.out.println("白种人白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("欧美人说英语");
    }
}

package factorymethod;

/**
 * @ClassName AbstractHumanFactory
 * @Description
 * @Author xsir
 * @Date 2021/7/23 上午6:30
 * @Version V1.0
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T  createHuman(Class<T> clazz);

}

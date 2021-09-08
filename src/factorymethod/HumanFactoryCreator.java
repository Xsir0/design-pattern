package factorymethod;

/**
 * @ClassName HumanFactoryCreator
 * @Description
 * @Author xsir
 * @Date 2021/7/23 上午6:32
 * @Version V1.0
 */
public class HumanFactoryCreator extends AbstractHumanFactory {


    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {

        Human human = null;
        try {
            if (human == null) {
                human = (T)clazz.forName(clazz.getName()).newInstance();
            }
        }catch (Exception e){
            System.err.println("创建人类出问题了");
        }
        return (T) human;

    }

    public static void main(String[] args) {
        AbstractHumanFactory creator = new HumanFactoryCreator();
        YellowHuman human = creator.createHuman(YellowHuman.class);
        human.skin();
        human.talk();

    }

}

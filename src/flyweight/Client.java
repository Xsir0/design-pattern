package flyweight;

/**
 * @ClassName Client
 * @Description
 * @Author xsir
 * @Date 2021/8/5 上午8:25
 * @Version V1.0
 */
public class Client {


    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User man = UserFactory.getUser("男");
        man.setAge(11);
        man.setName("hello");

        User man1 = UserFactory.getUser("男");

        System.out.println(man1.getName());

    }


}

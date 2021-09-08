package flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName UserFactory
 * @Description
 * @Author xsir
 * @Date 2021/8/5 上午8:25
 * @Version V1.0
 */
public class UserFactory {

    static Map<String,User> pool = new HashMap<>();

    public static User getUser(String gender){

        User result;
        if (Objects.isNull(pool.get(gender))){
            result = new UserPoolUtil(gender);
            pool.put(gender,result);
        }else {
            result = pool.get(gender);
        }

        return result;
    }

    public static Map<String, User> getPool() {
        return pool;
    }
}

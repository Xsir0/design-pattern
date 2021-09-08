package flyweight;

/**
 * @ClassName UserPoolUtil
 * @Description
 * @Author xsir
 * @Date 2021/8/5 上午8:28
 * @Version V1.0
 */

public class UserPoolUtil extends User {
    public UserPoolUtil(String key) {
        this.key = key;
    }

    String key;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

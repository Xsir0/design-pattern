package flyweight;

/**
 * @ClassName User
 * @Description
 * @Author xsir
 * @Date 2021/8/5 上午8:24
 * @Version V1.0
 */
public class User {

    private String name;

    private Integer age;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

package obverser;

import java.util.Observable;

/**
 * @ClassName EntityDemo
 * @Description
 * @Author xsir
 * @Date 2021/8/1 下午4:05
 * @Version V1.0
 */
public class EntityDemo extends Observable {

    private String name;
    private Integer age;

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
        super.setChanged();
        super.notifyObservers(age);
    }
}

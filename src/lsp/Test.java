package lsp;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description
 * @Author xsir
 * @Date 2021/7/21 下午9:04
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Son son = new Son();
        HashMap map = new HashMap<>();
        // 此处，当 子类的前置参数范围小于父类的前置参数范围时，父类的方法将不执行。
        son.exec(map);

        Father father = new Father();
        father.exec(map);
    }

}

package lambdademo;

import interfacedemo.AnonymousInterface;
import interfacedemo.OneArgInterface;

public class InterfaceLambdaTest {

    public static void testOneArg(OneArgInterface oneArgInterface){oneArgInterface.sleep("Xiao Wo");}

    public static void main(String[] args) {

        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类AnonymousInterface show off");
            }
        };
        anonymousInterface.show();
        //无参数无返回
        AnonymousInterface anonymousInterface1 = () -> System.out.println("lambda AnonymousInterface show off");
        anonymousInterface1.show();
        //一个参数无返回
        OneArgInterface oneArgInterface = (String place)->System.out.println("今天我在"+place+"睡觉");
        testOneArg(oneArgInterface);

    }
}

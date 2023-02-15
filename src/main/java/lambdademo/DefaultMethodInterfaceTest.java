package lambdademo;

import lambdademo.DefaultMethodInterface;

import java.util.Arrays;

public class DefaultMethodInterfaceTest{

    public static void main(String[] args){
        DefaultMethodInterface defaultMethodInterface = new DefaultMethodInterface();
        String results[] = defaultMethodInterface.method();
        Arrays.asList(results).forEach(item->System.out.println("results "+item));

    }

}

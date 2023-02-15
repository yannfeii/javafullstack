package lambdademo;

public class DefaultMethodInterface implements Interface1, Interface2 {

    public String[] method() {
//        return  Interface1.super.method();
//        return interface2.super.method();
        String [] results = {Interface1.super.method()[0], Interface2.super.method()[0]};
        return  results;
    }

}


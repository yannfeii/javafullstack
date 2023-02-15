package lambdademo;

public interface Interface2 {
    default String[] method(){
        return new String[] {"this is interface2"};
    }
}

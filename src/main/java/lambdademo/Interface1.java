package lambdademo;
public interface Interface1 {

    default String[] method(){
        return new String[] {"this is interface1"};
    }
}

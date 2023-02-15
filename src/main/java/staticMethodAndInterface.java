public class staticMethodAndInterface {

    interface printer{
        abstract String connectType();
        String defaultPrint();
    }
    public void connectType(){
        System.out.println("Default connect Type is black and write");
    }

    public void defaultPrint(){
        System.out.println("Default print color is black and write");
    }


    public static void main(String[] args){

    }
}

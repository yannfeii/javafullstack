package lambdademo;

public class lambdaDemo02 {

    interface Adder {
        public void add(int num1, int num2);
    }

    public static void main(String[] args) {
        Adder adder = (int num1, int num2) -> {
            System.out.println(num1 + num2);
        };
        adder.add(5, 10);
    }
}




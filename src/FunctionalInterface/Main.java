package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
//        FunctionalInterfaceExample functionalinterfaceexample =new FunctionalInterfaceExample() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
       // System.out.println(functionalinterfaceexample.add(5,8));
        FunctionalInterfaceExample functionalinterfaceexample =(int a,int b) -> {
            System.out.println("I am here");
            return a+b;
        };
        System.out.println(functionalinterfaceexample.add(8,5));
    }
}

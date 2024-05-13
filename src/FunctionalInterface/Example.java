package FunctionalInterface;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        int sum=0;
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                sum=sum+list.get(i)*list.get(i);
            }
        }
        System.out.println("result after iterative ways== " + sum);
        int sum1=list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("I am inside filter method");
                return integer%2==0;
            }
        }).map(new Function<Integer, Integer>() {

            public Integer apply(Integer integer){
                System.out.println("I am inside map method");
                return integer*integer;
            }
        }).reduce( 0 , new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                System.out.println("I am inside reduce method");
                System.out.println("first number= "+ integer);
                System.out.println("second number= "+ integer2);
                return integer + integer2;
            }
        });

       int zx=list.stream().filter(i -> (i%2==0)).map(i -> i*i).reduce(0,(i,j)->i+j);
     System.out.println("result after declartive= "  + sum1);
        System.out.println("zx== " + zx);
    }
}


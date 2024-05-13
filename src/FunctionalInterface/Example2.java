package FunctionalInterface;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.*;
public class Example2 {
    public static void main(String[] args) {
      //  "ksnfjenieirk","ldmfkejfl","jfjefh","lmwdkfiefiefddl","msdjksj";
        List<String> list=Arrays.asList("kkkkkkkkkkkkkkkk","ldmfkejfl","jfjefh","lmwdkfiefiefddl","msdjksj","aa");
        List<String> p=  list.stream().map(i -> i.length()>10? i.substring(0,10):i).filter(i-> i.charAt(0)==i.charAt(i.length()-1)).collect(Collectors.toList());
         System.out.println(p);

    }
}

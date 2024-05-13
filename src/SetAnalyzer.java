import java.util.*;
public class SetAnalyzer implements KeyAnalyzer{

    private Set<String> set;

    SetAnalyzer(){
        set=new TreeSet<>();
    }

    public void storeData(String key){
        set.add(key);
    }

    public List<String> getValue(){
        ArrayList list=new ArrayList<>();
        list.addAll(set);
        return list;
    }



}

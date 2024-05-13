import java.util.*;
public class ListAnalyzer implements KeyAnalyzer{

    private List<String> list;

    ListAnalyzer(){
        list=new ArrayList<>();
    }

    public void storeData(String key){
        list.add(key);
    }

    public List<String> getValue(){
        return list;
    }
}

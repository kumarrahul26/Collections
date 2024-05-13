import java.util.*;

public class MapAnalyzer implements KeyAnalyzer{

    private Map<String,Integer> map;

    MapAnalyzer(){
        map=new TreeMap<>();
    }

    @Override
    public void storeData(String key) {
        if(map.containsKey(key)){
            map.put(key,map.get(key)+1);
        }else{
            map.put(key,1);
        }

    }

    @Override
    public List<String> getValue() {
        List<String> list=new ArrayList<>();
        list.add("jg");return list;
    }

    public Map<String,Integer> getResult(){
        return map;
    }
}

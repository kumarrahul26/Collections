import java.util.*;
public interface KeyAnalyzer {

    public void storeData(String key);

    public List<String> getValue();

    public default Map<String,Integer> getResult(){
        return null;
    }


}

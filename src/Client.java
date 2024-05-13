public class Client {
    public static void main(String[] args) {
         KeyAnalyzer keyanalyzer =new MapAnalyzer();
        keyanalyzer.storeData("Ram");
        keyanalyzer.storeData("Raj");keyanalyzer.storeData("Amit");
        keyanalyzer.storeData("Amit");
        keyanalyzer.storeData("Badal");keyanalyzer.storeData("Suresh");
        keyanalyzer.storeData("Priya");keyanalyzer.storeData("Suresh");
        System.out.println(keyanalyzer.getResult());
    }
}

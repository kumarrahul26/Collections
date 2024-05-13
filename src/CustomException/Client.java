package CustomException;

public class Client {

    public String CheckAge(int age){
        if(age>18){
            return "Access Granted";
        }else{
            throw new CustomExceptionDemo("Access Denied----Below Age");
        }
    }

    public static void main(String[] args) {
        Client c=new Client();
        System.out.println(c.CheckAge(5));
    }
}

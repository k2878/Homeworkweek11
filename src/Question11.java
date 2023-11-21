import java.util.ArrayList;

public class Question11 {
    String a = "Kulwinder";
    public static void main(String[] args){
        ArrayList<String> groups = new ArrayList<>();
        groups.add("java");
        groups.add("Selenium");
        groups.add("Agile");
        groups.add("Postman");
       // System.out.println(groups);

        for(String each : groups){
           // System.out.println(each);
        }

        System.out.println("My Group Name at index 3: "+ groups.get(3));




    }
}

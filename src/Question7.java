import java.util.HashMap;

public class Question7 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Sam", 1);
        people.put("Ena", 2);
        people.put("Amily", 3);
        people.put("Jordan", 4);

        System.out.println(people);


        for (String keys: people.keySet()) {
            System.out.println(keys);

        }
        for(Integer values: people.values()){
            System.out.println(values);

        }
    }
}


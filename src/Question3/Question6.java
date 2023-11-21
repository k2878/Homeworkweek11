package Question3;

import java.util.HashSet;

public class Question6 {
    public static void main(String[] ags){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        System.out.println(numbers);

        for(int i = 1; i <= 10 ; i++){
            if(numbers.contains(i)){
                System.out.println("numbers between One and Ten in the set:  " + i);
            }else{
                System.out.println("numbers not between One and Ten in the set:  " + i);
            }


        }
    }
}

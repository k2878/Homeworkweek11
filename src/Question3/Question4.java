
package Question3;


import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cow");

        System.out.println(animals);
        for (String c : animals) {
            System.out.println(c);

        }

        Iterator<String> be = animals.iterator();
        System.out.println(be.next());

    }
}
package SECOND_PROBLEM_OOP_JAVA;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Animal> group = new ArrayList<>();
        
        group.add(new Animal("Bettle", "Jack", "Male", "Black", "Small"));
        group.add(new Animal("Bettle", "Jolyn", "Female", "Black", "Small"));
        group.add(new Animal("Bettle", "John", "Male", "Black", "Small"));
        group.add(new Animal("Bettle", "Kelly", "Female", "Black", "Small"));
        group.add(new Animal("Bettle", "Stan", "Male", "Black", "Small"));
        
        for(int i = 0; i < group.size(); i++)
            System.out.println(group.get(i));
        System.out.println("---------------------------");
        group.get(0).get_children("John");
        group.get(0).get_children("Kelly");
        group.get(0).get_children("Stan");

        group.get(1).get_children("John");
        group.get(1).get_children("Kelly");
        group.get(1).get_children("Stan");

        group.get(2).get_parents("Jack");
        group.get(2).get_parents("Jolyn");

        group.get(3).get_parents("Jack");
        group.get(3).get_parents("Jolyn");

        group.get(4).get_parents("Jack");
        group.get(4).get_parents("Jolyn");

        for(int i = 0; i < group.size(); i++)
        {
            group.get(i).show_tree();
            System.out.println();
        }
    }
}

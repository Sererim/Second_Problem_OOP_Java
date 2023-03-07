package SECOND_PROBLEM_OOP_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal implements Being, Geneology{

    private ArrayList<String> animal = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private ArrayList<String> parentList = new ArrayList<>();
    private ArrayList<String> childList = new ArrayList<>();
    private static ArrayList<String> animalsList = new ArrayList<>();

    public Animal()
    {
        this.animal.add(get("Animal name"));
        this.animal.add(get("Name"));
        this.animal.add(get("Sex"));
        this.animal.add(get("Color"));
        this.animal.add(get("Size"));
        animalsList.addAll(this.animal);
    }

    public Animal(String animal_name, String name, String sex, String color, String size)
    {
        this.animal.add(animal_name);
        this.animal.add(name);
        this.animal.add(sex);
        this.animal.add(color);
        this.animal.add(size);
        animalsList.addAll(this.animal);
    }

    @Override
    public String toString() {
        String foo = "";
        if(this.animal.size() != 0)
        {
            for(int i = 0; i < this.animal.size(); i++)
                foo += (this.animal.get(i) + " : ");
        }
        return foo;
    }

    public String get(String foo)
    {
        System.out.println("Enter: " + foo);
        foo = scan.nextLine();
        return foo;
    }

    public void get_children(String name)
    {
        for(int i = 0; i < animalsList.size(); i++)
            if(name.equals(animalsList.get(i)))
                this.childList.add(name);
    }

    public void get_parents(String name)
    {
        for(int i = 0; i < animalsList.size(); i++)
        if(name.equals(animalsList.get(i)))
            this.parentList.add(name);
    }

    public boolean isParent()
    {
        if(this.childList.size() != 0)
            return true;
        return false;
    }

    public boolean isChild()
    {
        if(this.parentList.size() != 0)
        return true;
    return false;
    }

    public void show_tree()
    {
        if(isParent())
        {
            System.out.print( this.animal.get(0) + " " + this.animal.get(1) + "\nChildren: ");
            for(int i = 0; i < this.childList.size(); i++)
                System.out.print(this.childList.get(i) + " ");
            System.out.println();
        }
        if(isChild())
        {
            System.out.print( this.animal.get(0) + " " + this.animal.get(1) + "\nParents: ");
            for(int i = 0; i < this.parentList.size(); i++)
                System.out.print(this.parentList.get(i) + " ");
            System.out.println();
        }
    }
}
package SECOND_PROBLEM_OOP_JAVA;
import java.util.ArrayList;

public interface Geneology {
    
    public boolean isParent();
    
    public boolean isChild();

    public void show_tree();

    public void get_children(String name);

    public void get_parents(String name);
}

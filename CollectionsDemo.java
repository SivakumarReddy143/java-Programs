package Collection;

import java.util.*;

public class CollectionsDemo{
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(34);
        obj.add(23);
        obj.add(24);
        obj.add(8);
        Collections.sort(obj);
        System.out.println(obj);
    }
}
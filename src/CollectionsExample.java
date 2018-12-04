import java.util.*;

public class CollectionsExample {

    public static void main(String[] args){

        List<String> list1 = Arrays.asList("React","Angular","Vue");
        List<Integer> list2 = Arrays.asList(1,7,2,5,33,7,8,7,8,75,77);

        System.out.println("position of 2: "+Collections.binarySearch(list2, 7));

        //iterator interface//
        Collection collection = Arrays.asList("red", "blue", "green");
        Iterator iterator = collection.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}

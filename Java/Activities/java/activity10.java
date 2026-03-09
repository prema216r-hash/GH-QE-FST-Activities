import java.util.*;
public class activity10 {
    public static void main(String args[])
    {
        HashSet <String> hs=new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println("Size of the Hash set:"+hs.size());
        hs.remove("F");
        System.out.println("After removing an element:"+hs);
        System.out.println(hs.remove("P"));
        System.out.println("present in list:"+hs.contains("A"));
        System.out.println("final list:"+hs);
    }
}

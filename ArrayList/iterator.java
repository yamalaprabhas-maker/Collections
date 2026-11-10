package ArrayList;
import java.util.*;

public class iterator {
    public static void main(String[]args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(2);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        while(it.hasPrevious())
        {
            System.out.print(it.previous()+" ");
        }
    }
}

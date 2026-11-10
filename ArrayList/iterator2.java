package ArrayList;
import java.util.*;

public class iterator2 {
    public static void main(String[]args)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            list.add(i);
        }
        // System.out.print(list.size());
        // ListIterator<Integer> it = list.listIterator();
        // while(it.hasNext())
        // {
        //     int r = it.next();
        //     if(r%2==0)
        //     System.out.print(r+" ");
        // }
        for(int n : list)
        {
            System.out.print(n+" ");
        }
    }
}

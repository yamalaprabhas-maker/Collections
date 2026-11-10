package ArrayList;
import java.util.*;

class student implements Comparable<student> {
// {     
    private String sname;
    private int sid;
    private int age;
    private double smarks;
    public void setName(String n)
    {
        sname = n;
    }
    public void setId(int id)
    {
        sid = id;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setMarks(double marks)
    {
        smarks = marks;
    }
    public int compareTo(student s)
    {
        return this.sid - s.sid;
    }
    // @override
    public String toString()
    {
        return sname+" "+sid+" "+age+" "+smarks;
    }
}
public class Main
{
    public static void main(String[]args)
    {
        student s1 = new student();
        s1.setName("prabhas");
        s1.setId(54);
        s1.setAge(23);
        s1.setMarks(89.7);

        student s2 = new student();
        s2.setName("raju");
        s2.setId(43);
        s2.setAge(25);
        s2.setMarks(90.7);

        student s3 = new student();
        s3.setName("yamala");
        s3.setId(12);
        s3.setAge(26);
        s3.setMarks(67.9);

        List<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        System.out.println(list);
    }  
}




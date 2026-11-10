package ArrayList;
import java.util.*;

class mey implements Comparable<mey>
{
    private String eName;
    private int empId;
    private double empSalary;
    private String empDept;
    public void setEname(String name)
    {
        eName = name;
    }
    public void setEmpid(int id)
    {
        empId = id;
    }
    public void setempSalary(double salary)
    {
        empSalary = salary;
    }
    public void setempDept(String dept)
    {
        empDept = dept;
    }
    public String geteName()
    {
        return eName;
    }
    public int getempId()
    {
        return empId;
    }
    public double getempSalary()
    {
        return empSalary;
    }
    public String getempDept()
    {
        return empDept;
    }
    // @override
    public int compareTo(mey m)
    {
        return m.empId - this.empId;
    }
    public String toString()
    {
        return eName+" "+empId+" "+empSalary+" "+empDept;
    }
}
public class employe {
    public static void main(String[]args)
    {
        mey m1 = new mey();
        m1.setEname("prabhas");
        m1.setEmpid(12);
        m1.setempSalary(80000.00);
        m1.setempDept("it");
        mey m2 = new mey();
        m2.setEname("yamala");
        m2.setEmpid(29);
        m2.setempSalary(903.00);
        m2.setempDept("non it");
        mey m3 = new mey();
        m3.setEname("raju");
        m3.setEmpid(60);
        m3.setempSalary(76000.00);
        m3.setempDept("it");
        List<mey> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        // String name = "raju";
        // for(mey m : list)
        // {
        //     if(m.geteName().equals(name))
        //     {
        //         System.out.println(m);
        //     }
        // }
        // double salary = 0.0;
        // double s2 = salary;
        // for(mey m : list)
        // {
        //     if(m.getempSalary() > salary)
        //     {
        //         s2 = salary;
        //         salary = m.getempSalary();
        //     }
        //     else if(m.getempSalary() > s2 && m.getempSalary() != salary)
        //     {
        //         s2 = m.getempSalary();
        //     }
        // }
        // System.out.println(salary);
        // System.out.println(s2);
        // Collections.sort(list);
        // System.out.println(list);
        System.out.println(list);
        // for(mey m : list)
        // {
        //     // if(m.getempDept().equals("it"))
        //     // {   
        //     //     double percentage= m.getempSalary()*15/100;
        //     //     m.setempSalary(m.getempSalary()+percentage);
                
        //     // }
        //     if(m.getempSalary() > 50000)
        // }
        Iterator<mey> l1 = list.iterator();
        while(l1.hasNext())
        {
            if(l1.next().getempSalary() < 50000)
            {
                l1.remove();
            }
        }
        System.out.println(list);
    }
}

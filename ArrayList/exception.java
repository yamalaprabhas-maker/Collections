package ArrayList;

import java.util.Scanner;

public class exception {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        for(int i=1;i<=3;i++)
        {
            try  
            {
                if(i==1)
                {
                    int n = sc.nextInt();
                    int []a = new int[n];
                    for(int l=0;l<a.length;l++)
                    {
                        a[l] = sc.nextInt();
                    }  
                    int index = sc.nextInt();
                    System.out.println(a[index]);
                }
                else if(i==2)
                {
                    String s = sc.next();
                    if(s.equals("null"))
                    {
                        s = null;
                    }
                    System.out.println(s.length());
                }
            }
            catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }   
        
            
    }
}

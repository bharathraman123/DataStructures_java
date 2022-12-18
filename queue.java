import java.util.*;
import java.io.*;

public class queue{
    int f=-1,r=-1,n=2;
    int Q[]=new int[n];

    public void insertq(int d)
    {
        if(f==(r+1)%n)
        {
            System.out.println("queue overflow");
            
        }
        else 
        {
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
                Q[r]=d;

            }
            else{
                r=(r+1)%n;
                Q[r]=d;
            }
            

        }
    }

    public void deleteq()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("queue underflow");
        }
        else{

            if(f==r){
                f=-1;
                r=-1;
            }
            else{
                f=(f+1)%n;
            }
        }
            
    }

    public void display()
    {
        int i;
        for(i=f;i<r;i=(i+1)%n)
        {
            System.out.println(+Q[i]);

        }
        System.out.println(Q[i]);


    }


    public static void main(String arg[])
    {
        queue obj=new queue();
        obj.insertq(5);
        obj.insertq(10);
        obj.insertq(3);
        obj.display();
        obj.deleteq();
        obj.display();

    }
}
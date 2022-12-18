import java.util.*;
import java.io.*;

       class node{
        public int data;
        public node next;

        public node(int d){
            data=d;

        }

        public void displaynode(){
            System.out.println(data);
        }
    }

    public class linkedlist
    {

     public node first=null;

      public void insertfirst(int d)
     {
        node nl=new node(d);
        if(first==null)
        {
            first=nl;
        }
        else{
            nl.next=first;
            first=nl;
        }
     }

     public node deletefirst()
     {
        node temp;
        temp=first;
        first=first.next;
        return temp;
     }

     public void insertlast(int d)
     {
        node curr=first;
        node nl=new node(d);

        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=nl;
        nl.next=null;

     }

     public void insertafter(int d,int k)
     {
        node nl=new node(d);
        node curr=first;

        while(curr.data!=k)
        {
            if(curr.next==null)
            {
                System.out.println("key not present");
                break;

            }
            else
            curr=curr.next;

        }

        nl.next=curr.next;
        curr.next=nl;

     }

     public void displaylist()
     {
        node curr=first;
        while(curr.next!=null)
        {
            curr.displaynode();
            curr=curr.next;
        }
        curr.displaynode();
     }


     public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        linkedlist newlink=new linkedlist();
        System.out.println("enter the number of nodes: ");
        int n=sc.nextInt();
        int i=1;
        newlink.insertfirst(5);

        while( i<=(n-1))
        {
            System.out.println("enter the node value: ");
            int ds=sc.nextInt();
            newlink.insertlast(ds);
            i++;

        }

        System.out.println("nodes");
        newlink.displaylist();

        newlink.insertafter(8, 2);

        newlink.displaylist();

     }



}
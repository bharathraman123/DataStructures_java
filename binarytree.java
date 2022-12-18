import java.util.*;
import java.io.*;
 class node
{
    int data;
    node lchild;
    node rchild;

    public node(int d)
    {
        data=d;
        lchild=null;
        rchild=null;
    }
    public void displaynode()
    {
        System.out.println(data);
    }
}

public class binarytree
{
    node root=null;

    public void insert(int d)
    {
        node current=root;
        node parent=root;
        node nl=new node(d);

        if(root==null)
        {
            root=nl;
        }
        else
        {
            while(current!=null)
            {
                parent=current;
                if(nl.data>current.data)
                {
                    current=current.rchild;
                }
                else
                {
                    current=current.lchild;
                }
            }

            if(nl.data>parent.data)
            {
               parent.rchild=nl;
            }
            else{
                parent.lchild=nl;
            }
        }
    }

    public void search(int key)
    {
        node current=root;
        node parent=root;
        int flag=1;

        if(root==null)
        {
            System.out.println("binary tree is empty:");

        }
        else
        {


            while(true)
            {
                parent=current;
                if(key>current.data)
                {
                    current=current.rchild;
                    if(current==null)
                    {
                        flag=0;
                        break;
                    }
                   
                }
                else if(key<current.data)
                {
                    current=current.lchild;
                    if(current==null)
                    {
                        flag=0;
                        break;
                    }
                }
                else 
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("item not found: ");

        }
        else
        {
            System.out.println("item found");
        }

    }

    public void inorder(node localroot)
    {
        if(localroot!=null)
        {
            inorder(localroot.lchild);
            localroot.displaynode();
            inorder(localroot.rchild);

        }
        else
        return;
    }

    public void preorder(node localroot)
    {
        if(localroot!=null){
        localroot.displaynode();
        preorder(localroot.lchild);
        preorder(localroot.rchild);
        }
        else
        return;
    }

    public void postorder(node localroot)
    {
        if(localroot!=null)
        {
            postorder(localroot.lchild);
            postorder(localroot.rchild);
            localroot.displaynode();
        }
        else 
        return;
    }

    public void small()
    {
        node current=root;
        node parent=root;
        if(root==null)
        {
            System.out.println("empty");
        }
        
        else{
            while(current!=null)
          {
            parent=current;
            current=current.lchild;
          }
          System.out.println(parent.data);

        }
    }

    public void large()
    {
        node current=root;
        node parent=root;

        if(root==null)
        {
            System.out.println("empty");
        }
        else{
            while(current!=null)
            {
                parent=current;
                current=current.rchild;
            }
        }
        System.out.println(parent.data);
    }


    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        binarytree t=new binarytree();
        int c;
         
       

        do{
            System.out.println("ennter the value: ");
            int n=sn.nextInt();

            t.insert(n);


            System.out.println("do u want to continue: press 1::");
            c=sn.nextInt();



        }while(c==1);

        t.search(4);

        //t.inorder(t.root);
        //t.preorder(t.root);
        t.small();
        t.large();
    

    }
}
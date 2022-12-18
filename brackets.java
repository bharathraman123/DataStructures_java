import java.util.*;

class stack{
    public int top=-1;
    public char arr[]=new char[20];
    public int max;


    public char push(char d)
    {
        top++;
        arr[top]=d;
    }

    public char pop()
    {
        char b=arr[top];
        top--;
        return b;
    }

    public boolean isFull()
    {
        if(top==max-1)
        {
            return true;
        }
        else
        return false;
    }

    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        else 
        return false;
    }
}

class brackets()
{
    public static void main(String[] args)
    {
    Scanner sn=new Scanner(System.in);
    System.out.println("enter the string: ");
    String s=sn.nextLine;
    char bro;
    if(bro='{'||bro=='('||bro=='[')
    {
        
    }

    }
}
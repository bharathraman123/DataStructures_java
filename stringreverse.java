import java.util.*;

class stack{
    public int max;
    public int top=-1;
    public char arr[]=new char[max];

    public stack(int m){
        max=m;
    }

    public void push(char a){
        top++;
        if(top==max-1){
            System.out.println("stack is full");
        }
        else{
        arr[top]=a;
        }

    }

    public char pop()
    {
        char temp;
        temp=arr[top];
        top--;
        return temp;
    }

    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        else
        return false;
    }

    public boolean isFull()
    {
        if(top==max-1)
        return true;
        else 
        return false;
    }
}

class stringreverse
{
    public static void main(String[] args){
        String rev="";
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the string: ");
        String input;
        input=sn.nextLine();
        stack st=new stack(input.length());

        for(int i=0;i<input.length();i++)
        {
            st.push(input.charAt(i));
        }

        while(!st.isEmpty())
        {
            rev=rev+st.pop();
        }
        
        if(input.equals(rev))
        {
            System.out.println("palindrom");

        }
        else{
            System.out.println("not palinderom");
        }


    }

}
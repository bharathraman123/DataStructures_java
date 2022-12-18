import java.util.*;

class stack
{
    public int max;
    public char arr[]=new char[20];
    public int top=-1;

    stack(int m)
    {
        max=m;
    }

    public void push(char a)
    {
        if(top==max-1)
        {
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top]=a;
        }
    }

    public char pop()
    {
            char b=arr[top];
            top--;
            return b;

    }

    public boolean isEmpty()
    {
        if(top==-1){
           return true;
        }
        else
        return false;
    }
}

class palindrom{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("enetr the string: ");
        String input=sn.nextLine();
        stack st=new stack(input.length());

        for(int i=0;i<input.length();i++)
        {
            st.push(input.charAt(i));
        }
         String reverse="";
         while(!st.isEmpty())
         {
         reverse=reverse+st.pop();
         }
       /*  for(int i=0;i<st.max-1;i++)
        {
            st.pop();
        }*/

         if(input.equals(reverse)){
             System.out.println("palindrome ");
         }
         else{
             System.out.println("not palindrom ");
         }
    }
}
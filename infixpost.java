import java.util.*;

class stack{
    public int max;
    public int top=-1;
    public char arr[];

    public stack(int m)
    {
        max=m;
        arr=new char[max];
    }

    public void push(char a)
    {
        top++;
        arr[top]=a;
    }

    public char pop()
    {
        char temp;
        temp=arr[top];
        top--;
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

    public char peak()
    {
       return arr[top];
    }
}

class infixpost
{
    char ch;
    public char pty()
    {
        switch(ch)
        {
            case '^':return 3;
            case'/':return 2;
            case'*':return 2;
            case '+':return 1;
            case '-':return 1;
        }
        return 0;
    }
    public static void main(String[] args)throws IOException
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the infix: ");
        String input=sn.nextLine();
        stack st=new stack(input.length());
       char curr;
       String postfix="";
       for(i=0;i<input.length();i++)
      {
         curr=input.charAt(i);

         if(curr=='(')
         {
             st.push(curr);
         }
          else if(cur=='+'||curr=='/'||curr=='*'||curr'-')
         {
            ;
         }
        }
    


    }

}
    
        
    


}
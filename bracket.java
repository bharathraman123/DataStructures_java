import java.rmi.MarshalException;
import java.util.*;

class stack{

    public int max;
    public int top=-1;
    public char arr[];

    public stack(int m){
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

    public char peak(){
        return arr[top];
    }


}

class bracket
{
    public static void main(String[] args)
    {
        int count=0;
        char curr;
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the expression : ");
        String input=sn.nextLine();
        stack st=new stack(input.length());

        for(int i=0;i<input.length();i++)
        {
            if(!st.isFull())
            {
            curr=input.charAt(i);
            if(curr=='('||curr=='{'||curr=='[')
            {
                st.push(curr);
            }
            /*if(curr==')'||curr=='}'||curr==']')
            {
                if(st.isEmpty())
                {
                    break;
                }
            }*/

           /* if((curr==')' && st.peak()=='(') ||(curr=='}' && st.peak()=='{' )|| (curr==']' && st.peak()=='['))
            {
                
                st.pop();
                count++;

            }*/

            if(curr==')' && st.peak()=='('){
                count++;
                st.pop();
            }

            if(curr==']' && st.peak()=='['){
                count++;
                st.pop();
            }

            if(curr=='}' && st.peak()=='{'){
                count++;
                st.pop();
            }

           



            }
            
        }

        if(!st.isEmpty())
        {System.out.println("invalid"+count);

        }
        else 
        {
            System.out.println("valid brackets"+count);
            System.out.println("valid");
        }

      /*  while(!st.isEmpty())
        {
            

        }*/

    }
}

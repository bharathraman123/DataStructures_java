import java.util.Scanner;

public class myjava{

public static void main(String[] args){

Scanner obj=new Scanner(System.in);
System.out.println("enter name");
String name=obj.next();

System.out.println("enter number");
int num=obj.nextInt();

System.out.println("name: "+name);
System.out.println("number: "+num);


}
}
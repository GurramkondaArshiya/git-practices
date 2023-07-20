import java.util.*;
class Assignment06{
public void problem(String a,String b)
{
String res="";
int n1=a.length();
int n2=b.length();
if(n1<n2)
{
res=a+b+a;
System.out.println(res);
}
else
{
res=b+a+b;
System.out.println(res);
}
}
public static void main(String args[])
{
Assignment06 ob=new Assignment06();
Scanner sc=new Scanner(System.in);
System.out.println("Enter two strings");
String str1=sc.nextLine();
String str2=sc.nextLine();
ob.problem(str1,str2);
}
}
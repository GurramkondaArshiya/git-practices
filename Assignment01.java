class Assignment01
{
public static void main(String args[])
{
String str="joj";
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
if(str.equals(rev))
{
System.out.println("Palindrome");
}
else
System.out.println("not a palindrome");
}
}
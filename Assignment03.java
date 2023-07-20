// searching an element in the array

class Assignment03
{
public static void main(String args[])
{
int a[]={3,7,45,89,6,4,43};
int n=5;//element to search
int i;
for( i=0;i<a.length;i++)
{
if(a[i]==n)
{
System.out.println("Index of element in the array is"+(i));
}
}
if(i==a.length)
{
System.out.println("-1");
}

}
}

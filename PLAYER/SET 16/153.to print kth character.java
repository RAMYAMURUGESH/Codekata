//153.to print every kth character from the string

import java.util.*;
class printstr
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a;
int n,i,k;
System.out.println("ENTER THE INPUT STRING:");
a=in.nextLine();
n=a.length();
char ch[]=a.toCharArray();
System.out.println("ENTER THE k VALUE:");
k=in.nextInt();
for(i=k-1;i<n;i=i+k)
{
System.out.print(ch[i] + " ");
}
}}

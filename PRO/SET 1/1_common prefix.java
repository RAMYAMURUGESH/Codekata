//1.to print the common prefix 


import java.util.*;
class commonprefix
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String a,b;
int n,m,i,j;
System.out.println("ENTER THE INPUT STRINGS:");
a=in.nextLine();
b=in.nextLine();
n=a.length();
m=b.length();
char ch1[]=a.toCharArray();
char ch2[]=b.toCharArray();
System.out.println("COMMON PREFIX :");
for(i=0,j=0;i<n&&j<m;i++,j++)
{
if(ch1[i]==ch2[j])
System.out.print(ch1[i] );
else
System.out.println("NO PREFIX");

}
}}

package guvihunter;
import java.util.*;

public class Set9_97 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,i,j,i1=0,j1=0,count=0;
		
		a=in.nextInt();
		b=in.nextInt();
		int pa[]=new int[a];
		int pb[]=new int[b];
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				pa[i1]=i;
				i1++;
			}
		}
		for(j=1;j<=b;j++)
		{
			if(b%j==0)
			{
				pb[j1]=j;
				j1++;
			}
		}
		
		for(i=0;i<i1;i++)
		{
			for(j=0;j<j1;j++)
			{
			if(pa[i]==pb[j])
				count++;
			}
		}
if(count==1)
	System.out.println("yes");
else
	System.out.println("no");
in.close();
	}

}

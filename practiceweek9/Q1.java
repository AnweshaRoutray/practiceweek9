package practiceweek9;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
		  ar[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		int a=n+1,b=n+1,c=n+1;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(sum==(ar[k]+ar[j]+ar[i]))
					{
						a=i;b=j;c=k;
						break;
					}
				}
				if(a!=(n+1))
				{
					break;
				}
			}
			if(a!=(n+1)) {
				break;
			}
		}
		System.out.println(ar[a]+","+ar[b]+","+ar[c]);

	}

}

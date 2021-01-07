package practiceweek9;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int p=(int)(n/2);
		p=p+1;
		for(int i=1;i<=p;i++)
		{
			for(int j=p;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=i;j>1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		int r=n-p;
		n=n-p;
		for(int i=1;i<=n;i++,r--)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=r;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int j=r;j>1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}

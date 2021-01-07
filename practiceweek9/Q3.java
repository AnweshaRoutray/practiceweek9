package practiceweek9;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String roman[]= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		System.out.println("enter integer");
		int n=sc.nextInt();
		String str="";
		while(n!=0)
		{
		
			for(int i=0;i<base.length;i++)
			{
				if(base[i]>n)
				{
					int pos=i-1;
					int div=n/base[pos];
					for(int j=1;j<=div;j++)
					{
						str=str+roman[pos];
					}
					n=n-base[pos]*div;
					break;
				}
			}
		
		}
		System.out.println(str);
	}

}

package practiceweek9;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		String regex="["+s2+"]";
	    s1=s1.replaceAll(regex, "");
	    System.out.println(s1);
		
		

	}

}

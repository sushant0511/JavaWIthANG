package first;

import java.util.Scanner;
class TestScan
{
	public void data() {
		
		System.out.println("Enter a and b");
		Scanner sc=new Scanner(System.in);  // class 	
		
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	}
}

public class ScopeTest {


	public static void main(String[] args) {
		
		
		TestScan scan=new TestScan();
		scan.data();
		
		
		System.out.println("Main block ");
	
	}
}










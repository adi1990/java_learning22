import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		int num1, num2;
		int temp =1;
		System.out.print("Enter a number: "); 
		Scanner scan = new Scanner(System.in);
		num1= scan.nextInt();
		
		System.out.print("Enter anther number: "); 
		//Scanner scan2 = new Scanner(System.in);
		num2= scan.nextInt();
		scan.close();
		
		if(num2 < 0)
		{
			double shlili = Rashi2.power(num1, num2);
			System.out.println(shlili);
		}
		
		else 
		{
			double l = Rashi2.power(num1, num2);
			System.out.println(l);
		}

	}

}


public class Rashi2 {

	public static double power(double num1, double num2) {
		double temp =1;
		if(num2 < 0)
		{
			double x = powerF(num1);
			//System.out.println(x);
			num2 = -num2;
			num1 = x;
			//System.out.println(num2);
		}
		
		
		if(num2 == 0)
		{
			num1 = 1;
			temp = num1;
		}		
		
		else if(num2 == 1)
		{
			return num1;
		}
		
		else for(int i=0; i<num2; i++)
		{
			temp *= num1;			
		}	

		return temp;
	}

	private static double powerF(double num1) {
		
		num1 = 1/num1;
		
		return(num1);
	}

	
}
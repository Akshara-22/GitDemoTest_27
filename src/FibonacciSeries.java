import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int intNum1=0;int intNum2=1;int intNum3;int intRange;

		int intCount;
		System.out.println("Enter range you want:");
		Scanner n= new Scanner(System.in);
		intRange=n.nextInt();
		for(int inti=1;inti<=intRange;inti++)
		{

			System.out.println(intNum1);
			intNum3=intNum1+intNum2;
			intNum1=intNum2;
			intNum2=intNum3;

		}
	}


}

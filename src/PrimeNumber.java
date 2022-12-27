import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int intNum;int intCount=0;
		System.out.println("Enter any number:");
		Scanner n= new Scanner(System.in);
		intNum=n.nextInt();
		for(int inti=1;inti<=intNum;inti++)
		{
			if(intNum%inti==0)
			{		
				intCount++;
			}

		}
		if(intCount==2)
			System.out.println(" Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}

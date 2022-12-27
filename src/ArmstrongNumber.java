import java.util.Scanner;

public class ArmstrongNumber {



	public static void main(String[]args)
	{
		int c=0;int intTemp;int intArmstrongNo;
		System.out.println("input your number");
		Scanner n= new Scanner(System.in);
		int num=n.nextInt();
		intTemp=num;
		while(num>0)
		{
			intArmstrongNo=num%10;
			num=num/10;
			c=c+(intArmstrongNo*intArmstrongNo*intArmstrongNo);
		}
		if(intTemp==c)
			System.out.println("Armstrong number");

		else
			System.out.println("Not Armstrong number");

	}
}



import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int intNum1;int intNum2;
		System.out.println("Enter any two numbers:");  
		Scanner sc = new Scanner(System.in);
		intNum1 = sc.nextInt();  
		intNum2 = sc.nextInt();  
		System.out.println("Before swapping numbers: "+intNum1 +" "+ intNum2);  
		intNum1 =intNum1 + intNum2;   
		intNum2 = intNum1 - intNum2;   
		intNum1 =intNum1 - intNum2;   
		System.out.println("After swapping numbers: "+intNum1 +"  " + intNum2);   
	}

}

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int intNumber;
		int intSum=0;
		int intTemp;  
		System.out.println("Enter your number and press enter :");    

		Scanner n= new Scanner(System.in);		  
		intNumber=n.nextInt();
		intTemp=intNumber;
		while(intNumber>0){    
			intSum=intSum*10+intNumber%10;  
			intNumber=intNumber/10;    
		}    
		if(intTemp==intSum)    
			System.out.println("Entered Number is palindrome number ");    
		else    
			System.out.println("Entered Number is not palindrome number");    
	}  

}


import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum ,
		reverseNum;

		System.out.println("Enter Any Number: ");
		Scanner sc = new Scanner(System.in);
		intNum=sc.nextInt();

		while(intNum>0) {

			reverseNum = intNum % 10;
			System.out.print(reverseNum);
			intNum=intNum/10;

		}

	}

}

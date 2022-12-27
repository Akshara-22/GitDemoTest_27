
public class LargestOfThreeNumbers {

	public static void main(String[] args) {


		int intNum_1=40, intNum_2=80, intNum_3=50;  

		if(intNum_1>=intNum_2 && intNum_1>=intNum_3)  
			System.out.println(intNum_1+" is the largest Number");  
		else if (intNum_2>=intNum_1 && intNum_2>=intNum_3)  
			System.out.println(intNum_2+" is the largest Number");  
		else  
			//prints number 3 if the above conditions are false  
			System.out.println(intNum_3+" is the largest number");  
	}  

}


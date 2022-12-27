import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int intTemp;
		int intSize;
		int array[] = {10, 20, 25, 63, 96, 57};
		intSize = array.length;
		System.out.println("Size of array:"+intSize);
		Arrays.sort(array);
		//System.out.println("Largest number in array: "+array[intSize-1]);

		System.out.println("Second largest number in array: "+array[intSize-2]);

	}

}

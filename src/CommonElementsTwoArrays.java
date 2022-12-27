
public class CommonElementsTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,7,3,8,2};
		int[] arr2 = {2,12,9,8,32,7};

		for(int i = 0;i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) { 
					System.out.println(arr1[i]);
				} 
			} 
		}
	}

}

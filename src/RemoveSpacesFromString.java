
public class RemoveSpacesFromString {

	public static void main(String[] args) {

		String s1 = "t u t o r i a l s";    

		//Removes the white spaces using regex    
		s1 = s1.replaceAll("\\s+", "");    
		System.out.println("String after removing all  spaces : " + s1);    
	}    
}



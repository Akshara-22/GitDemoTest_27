
public class StringReverse {

	public static void main(String[] args) {

		int strLength;
		String strName="Automation";
		String strReverse="";

		strLength=strName.length();
		System.out.println("String length is:"+strLength);

		for(int i=strLength-1;i>=0;i--){
			strReverse= strReverse+strName.charAt(i);
		}
		System.out.println(strReverse);

	}

}

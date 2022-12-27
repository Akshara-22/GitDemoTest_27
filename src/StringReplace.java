
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("View timesheet create timesheet");
		System.out.println( "String before replace: "+ str);
		
		str = str.replaceAll( "timesheet" , "record" );
		System.out.println( "The String after replece : "+str );
	}
}



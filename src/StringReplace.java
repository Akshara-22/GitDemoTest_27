
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("View timesheet create timesheet");
		System.out.println( "String before replace: "+ str);
		System.out.println( "String before replace 1: "+ str);

		
		str = str.replaceAll( "timesheet" , "record" );
		System.out.println( "The String after replece : "+str );
		System.out.println( "The String after replece 1: "+str );

	}
}



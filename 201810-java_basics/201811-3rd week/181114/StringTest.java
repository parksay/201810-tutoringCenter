package Fourteenth;

public class StringTest {

	public static void main(String[] args) {
		String c = "JavaProgram";
		
		System.out.println(c.substring(2,4));
		System.out.println(c.substring(3));
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase().startsWith("AB"));
		System.out.println(c.compareTo("abcds"));
		System.out.println(c.compareTo("ab"));
		c = "010-1111-2222";
		String s[] = c.split("-");
		System.out.println(c);
		c = "abcadsfnask.jpg";
		System.out.println(c.substring(c.lastIndexOf("."), c.length()));
		String trim;
		if(c.length() >= 9)
		{
			trim = c.substring(0,6);
			System.out.println(trim + "-" + c.substring(c.lastIndexOf("."), c.length()));
		}
	}
	
	
}

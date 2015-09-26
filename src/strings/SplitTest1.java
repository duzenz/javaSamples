package strings;

/*
 * splitting a string
 */
public class SplitTest1 {

	public static void main(String[] args) {
		String test = "abc.def.123";
		String[] output = test.split("\\.");

		//alternative
		//String[] output = test.split(Pattern.quote("."));
		
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
	}
	
}

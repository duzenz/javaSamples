package strings;

import java.util.StringTokenizer;

/*
 * 
 * old way of split jdk 1.4
 */
public class SplitTest2 {

	public static void main(String[] args) {
		String test = "abc.def.123.546";

		StringTokenizer token = new StringTokenizer(test, ".");

		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
	
}

package javaLibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P0mainTest {

	public static void main(String[] args) {
		String str = "abcdef";
		String regex = "abc";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(str);
		if (m.find()){
		  System.out.println("ƒ}ƒbƒ`‚µ‚Ü‚µ‚½");
		  System.out.println(m.group());
		}

	}

}

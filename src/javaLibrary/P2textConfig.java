package javaLibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2textConfig {
	
	//����̕�����ŋ�؂���
	public void inputFline(String readLine) {
		readLine = readLine.trim();
		String[] readLineArray = readLine.split(" ");
//		a = Integer.parseInt(readLineArray[0]);
//		b = Integer.parseInt(readLineArray[1]);
//		R = Integer.parseInt(readLineArray[2]);
	}

	
	//�p�^�[���}�b�`
	public void pm(){
		
		String str = "abcdef";
		String regex = "abc";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(str);
		if (m.find()){
		  System.out.println("�}�b�`���܂���");
		  System.out.println(m.group());
		}
		
		
	}
	
}

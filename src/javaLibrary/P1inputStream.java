package javaLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1inputStream {
	
	//BufferedReaderを使用して一行づつテキストを読み込みます
	public void inpuStream() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {

		}

	}
}

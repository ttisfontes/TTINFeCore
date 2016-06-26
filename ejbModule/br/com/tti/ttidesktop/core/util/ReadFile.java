package br.com.tti.ttidesktop.core.util;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static String readFile(String path) throws Exception {
		FileInputStream f = new FileInputStream(path);

		DataInputStream dis = new DataInputStream(f);
		String line = dis.readLine();
		String all = new String();

		while (line != null) {
			all += line;
			line = dis.readLine();
		}

		f.close();
		return all;
	}

	public static String readFile(String path, String encoding)
			throws Exception {
		File fileDirs = new File(path);

		InputStreamReader is = new InputStreamReader(new FileInputStream(
				fileDirs), encoding);

		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
		String str = s.hasNext() ? s.next() : "";
		is.close();

		if (str.startsWith("\uFEFF")) {
			str = str.replace("\uFEFF", "");
		}
		return str;
	}

}

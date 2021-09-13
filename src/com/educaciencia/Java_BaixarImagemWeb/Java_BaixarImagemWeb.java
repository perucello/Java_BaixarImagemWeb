package com.educaciencia.Java_BaixarImagemWeb;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Java_BaixarImagemWeb {

	public static void main(String[] args) throws Exception {
		String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
		String destinationFile = "C:\\educaciencia\\image.jpg";
		saveImage(imageUrl, destinationFile);
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
		is.close();
		os.close();
	}

}

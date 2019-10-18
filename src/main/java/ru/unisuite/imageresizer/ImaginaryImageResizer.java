package ru.unisuite.imageresizer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImaginaryImageResizer implements ImageResizer {

	@Override
	public void resizeByWidth(InputStream is, int width, OutputStream os, Integer quality) throws IOException {

		URL u = new URL("http://10.242.101.40:9000/resize?quality=100&width=" + width);
		HttpURLConnection conn = (HttpURLConnection) u.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "image/jpeg");
//		conn.setRequestProperty("Content-Length", String.valueOf(length));
		
		try (OutputStream httpOs = conn.getOutputStream()) {
			writeToStream(is, httpOs);
		}
		
		try (InputStream httpIs = conn.getInputStream()) {
			writeToStream(httpIs, os);
		}
		

	}

	public void writeToStream(InputStream is, OutputStream os) throws IOException {

		int length;
		int bufSize = 4096;
		byte buffer[] = new byte[bufSize];

		while ((length = is.read(buffer, 0, bufSize)) != -1) {
			os.write(buffer, 0, length);
		}
		os.flush();

	}

	@Override
	public void resize(InputStream is, int width, int height, OutputStream os, Integer quality) throws IOException {

	}

	@Override
	public void resizeByHeight(InputStream is, int height, OutputStream os, Integer quality) throws IOException {
		// TODO Auto-generated method stub

	}

}

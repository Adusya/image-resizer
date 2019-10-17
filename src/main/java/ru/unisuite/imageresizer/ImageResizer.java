package ru.unisuite.imageresizer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ImageResizer {
	
	public void resizeByWidth(InputStream is, int width, OutputStream os, int length, float quality) throws IOException;
	
	public void resize(InputStream is, int width, int height, OutputStream os, float quality) throws IOException;
	
	public void resizeByHeight(InputStream is, int height, OutputStream os, float quality) throws IOException;
	
	
	
}

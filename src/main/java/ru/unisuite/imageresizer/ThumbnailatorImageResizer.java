package ru.unisuite.imageresizer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.resizers.configurations.Antialiasing;
import net.coobird.thumbnailator.resizers.configurations.Dithering;
import net.coobird.thumbnailator.resizers.configurations.Rendering;

public class ThumbnailatorImageResizer implements ImageResizer {
	
	static final Antialiasing antialiasing = Antialiasing.ON;
	static final Rendering rendering = Rendering.SPEED;
	
	@Override
	public void resize(InputStream is, int width, int height, OutputStream os, float quality) throws IOException {
		
		Thumbnails.of(is)
		.rendering(rendering)
		.antialiasing(antialiasing)
		.outputQuality(quality)
	    .size(width, height)
	    .toOutputStream(os);

	}
	
	@Override
	public void resizeByWidth(InputStream is, int width, OutputStream os, int length, float quality) throws IOException {
		
		Thumbnails.of(is)
		.rendering(rendering)
		.antialiasing(antialiasing)
		.outputQuality(quality)
	    .width(width)
	    .toOutputStream(os);

	}
	
	@Override
	public void resizeByHeight(InputStream is, int height, OutputStream os, float quality) throws IOException {

		Thumbnails.of(is)
		.rendering(rendering)
		.antialiasing(antialiasing)
		.outputQuality(quality)
	    .height(height)
	    .toOutputStream(os);
		
	}

}


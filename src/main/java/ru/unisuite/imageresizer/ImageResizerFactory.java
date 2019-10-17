package ru.unisuite.imageresizer;

public class ImageResizerFactory {

	ImageResizer imageResizer;

	public ImageResizerFactory() {
		this.imageResizer = new 
//				ImaginaryImageResizer();
				ThumbnailatorImageResizer();
	}

	public ImageResizer getImageResizer() {
		return imageResizer;
	}

}

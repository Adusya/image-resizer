package ru.unisuite.imageresizer;

public class ImageResizerFactory {

	private ImageResizerFactory() {		
	}

	public static ImageResizer getImageResizer() {
		return new 
				ThumbnailatorImageResizer();
//				ImaginaryImageResizer();
	}

}

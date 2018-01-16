package Proxy;

import Composite.Element;
import Visitor.Visitor;

public class ImageProxy extends Element {

	private String imageName;
	private Image image = null;

	public ImageProxy(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public void print() {
		getInstantiateImage();
		image.print();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitImage(this);
	}

	private void getInstantiateImage() {
		if (image == null) {
			image = new Image(imageName);
		}
	}

}

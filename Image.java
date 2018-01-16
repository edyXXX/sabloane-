package Proxy;

import Composite.Element;
import Visitor.Visitor;

public class Image extends Element {
	
	private String imageName;

	public Image(String imageName) {
		super();
		this.imageName = imageName;
	}

	@Override
	public void print() {
		System.out.print(imageName);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitImage(this);
	}

}

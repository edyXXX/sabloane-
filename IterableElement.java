package Composite;

import java.util.ArrayList;
import Visitor.Visitor;

public abstract class IterableElement extends Element {

	protected ArrayList<Element> elements;

	public IterableElement(ArrayList<Element> elements) {
		if (elements != null)
			this.elements = elements;
		else
			this.elements = new ArrayList<Element>();
	}

	public Element addElement(Element element) {
		elements.add(element);
		return this;
	}

	@Override
	public Element getElements(int index) throws Exception {
		return elements.get(index);
	}

	@Override
	public Element remove(int index) {
		elements.remove(index);
		return this;
	}

	@Override
	public void print() {
		for (Element e : elements)
			e.print();
	}

	@Override
	public void accept(Visitor visitor) {
		for (Element e : elements)
			e.accept(visitor);
	}

}

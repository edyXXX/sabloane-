package Composite;

import java.io.Serializable;
import Visitor.Visitor;

public abstract class Element implements Serializable {
	
	public void add(Element e) throws Exception {
		throw new Exception();
	}

	public Element remove(int index) throws Exception {
		throw new Exception();
	}

	public Element getElements(int e) throws Exception {
		throw new Exception();
	}

	public abstract void print();

	public abstract void accept(Visitor visitor);
	
}

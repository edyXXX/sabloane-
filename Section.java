package parts;

import Visitor.Visitor;
import java.util.ArrayList;
import Composite.Element;
import Composite.IterableElement;

public class Section extends IterableElement {
	
	private String title;

	public Section() {
		super(null);
	}

	public Section(String title) {
		super(null);
		this.title = title;
	}

	@Override
	public void print() {
		System.out.print(title);
		super.print();
	}
	
}

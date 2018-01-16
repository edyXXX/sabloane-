package parts;

import Visitor.Visitor;
import java.util.ArrayList;
import Composite.Element;
import Composite.IterableElement;

public class Chapter extends IterableElement {
	
	public Chapter(ArrayList<Element> elements) {
		super(elements);
	}

	@Override
	public void accept(Visitor visitor) {
	}
	
}

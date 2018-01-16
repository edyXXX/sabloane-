package parts;

import Composite.Element;
import Visitor.Visitor;

public class Table extends Element {
	
	@Override
	public void print() {

	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTable(this);
	}
	
}

package parts;

import Composite.Element;
import Strategy.AlignStrategy;
import Visitor.Visitor;

public class Paragraph extends Element {
	
	protected AlignStrategy align;
	protected String text;

	public String getText() {
		return text;
	}

	public Paragraph setText(String text) {
		this.text = text;
		return this;
	}

	@Override
	public void print() {
		if (align != null)
			align.print(text);
		System.out.println(text);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitParagraph(this);
	}

	public void setAlign(AlignStrategy align) {
		this.align = align;
	}
	
}

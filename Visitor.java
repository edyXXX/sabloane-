package Visitor;

import Composite.Element;

public interface Visitor {
	
	void visitSection(Element e);

	void visitImageProxy(Element e);

	void visitImage(Element e);

	void visitParagraph(Element e);

	void visitTable(Element e);
	
}

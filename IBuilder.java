package Builder;

import Composite.Element;

public interface IBuilder {
	
	IBuilder buildPart();

	Element getResult();
}

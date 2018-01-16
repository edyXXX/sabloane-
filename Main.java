import Composite.Element;
import Visitor.DocumentStatistics;
import Visitor.Visitor;
import parts.Section;
import Builder.IBuilder;
import Builder.JSONBuilder;

public class Main {

	public static void main(String[] args) {
		visitor();
		builder();
	}

	public static void visitor() {
		Element book = new Section();
		Visitor statistics = new DocumentStatistics();
		book.accept(statistics);
	}

	public static void builder() {
		IBuilder builder = new JSONBuilder("C:\\Users\\edy\\Desktop\\Tirca Eduard-Andrei\\Sabloane\\src")
				.buildPart();
		Element book = builder.getResult();
		book.print();
	}
	
}

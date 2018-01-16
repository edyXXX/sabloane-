package Builder;

import Proxy.Image;
import Proxy.ImageProxy;
import parts.Paragraph;
import parts.Section;
import Composite.Element;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSONBuilder implements IBuilder {

	private String fileName;
	private Element book;

	public JSONBuilder(String fileName) {
		this.fileName = fileName;
	}

	public Element getResult() {
		return book;
	}

	public IBuilder buildPart() {
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(fileName));

			book = getElement(jsonObject);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	private Element getElement(JSONObject jsonObject) {
		String type = (String) jsonObject.get("class");
		switch (type) {

		case "Section": {
			String title = (String) jsonObject.get("title");
			Section section = new Section(title);
			
			JSONArray childrens = (JSONArray) jsonObject.get("children");
			for (int i = 0; i < childrens.size(); i++)
				section.addElement(getElement((JSONObject) childrens.get(i)));
			
			return section;
		}

		case "Paragraph": {
			String text = (String) jsonObject.get("text");
			
			return new Paragraph().setText(text);
		}

		case "ImageProxy": {
			String url = (String) jsonObject.get("url");
			
			return new ImageProxy(url);
		}

		case "Image": {
			String url = (String) jsonObject.get("url");
			
			return new Image(url);
		}

		default:
			return null;
		}
	}

}

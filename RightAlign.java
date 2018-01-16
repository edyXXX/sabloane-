package Strategy;

public class RightAlign implements AlignStrategy {
	
	@Override
	public void print(String text) {
		System.out.println(text + "****");
	}
	
}

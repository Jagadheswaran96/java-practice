package code;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String input = "Automation Test Engineer";
		
		String stringAfterRemovedSpace = input.replaceAll("\\s", "");
		
		System.out.println("Final string after removing white-spaces: " + stringAfterRemovedSpace);
		
	}

}

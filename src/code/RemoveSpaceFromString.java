package code;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String input = "Automation Test Engineer";
		
		String stringAfterRemovedSpace = input.replaceAll("\\s*", "");
		
//		* represent as regex quantifier, it checks and replace white-spaces that appears 0 or more times
		
//		More Regex Quantifiers / Metacharacters below
//		Quantifier	Meaning	Example Matches
//		X?	Appears 0 or 1 time	"a?" -> "", "a"
//		X+	Appears 1 or more times	"a+" -> "a", "aa"
//		X*	Appears 0 or more times	"a*" -> "", "a", "aa"
//		X{n}	Appears exactly n times	"a{3}" -> "aaa"
//		X{n,}	Appears at least n times	"a{2,}" -> "aa", "aaa"
//		X{n,m}	Appears between n and m times	"a{2,4}" -> "aa", "aaa", "aaaa"
		
		System.out.println("Final String after Removing White-Spaces: " + stringAfterRemovedSpace);
		
//		Common Regex Patterns in Java
//		. : Any character
//		\d : Digit [0-9]
//		\D : Non-digit
//		\s : Whitespace
//		\S : Non-whitespace
//		\w : Word character [a-zA-Z0-9_]
//		\W : Non-word character
//		\b : Word boundary
//		\B : Non-word boundary
		
	}

}

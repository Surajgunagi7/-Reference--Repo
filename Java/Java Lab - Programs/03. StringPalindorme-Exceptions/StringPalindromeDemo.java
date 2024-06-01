
class StringPalindromeException extends Exception {
	private String title;

	public StringPalindromeException(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}

public class StringPalindromeDemo {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(args[0]);
		StringBuffer sb = new StringBuffer(str);

		if (str.toString().equals(sb.reverse().toString())) {
			System.out.println("String is Palindrome");
		} else {
			try {
				throw new StringPalindromeException("String is not Palindrome");
			} catch (StringPalindromeException sp) {
				sp.printStackTrace();
			}
		}
	}
}

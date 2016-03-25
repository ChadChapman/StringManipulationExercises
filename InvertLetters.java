
public class InvertLetters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invertLetters("hello there!");
	}

	public static void invertLetters(String wurds) {
		int indexNo, len = wurds.length();

		String stringOut;

		for (indexNo = (len - 1); indexNo >= 0; indexNo--) {
			System.out.print(wurds.charAt(indexNo));
		}
	}
}

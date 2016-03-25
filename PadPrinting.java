
public class PadPrinting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		padPrint("rhino", 12);
	}

	// find length of string
	// take in arg for total length
	public static void padPrint(String inputStr, int totalSpace) {
		int strLength = inputStr.length();
		//System.out.println(strLength);

		// subtract string length from total length arg
		int padLength = totalSpace - strLength;
		//System.out.println(padLength);
		
		// take difference and add that many spaces after string
		int spaceAdd = 0;
		String spaces = "";
		for (spaceAdd = 0; spaceAdd <= padLength; spaceAdd++){
			spaces +=  " ";
		}
		System.out.print(inputStr + spaces);
		// print string and additional spaces

	}
}

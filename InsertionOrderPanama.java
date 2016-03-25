
public class InsertionOrderPanama {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inserted = strngFix("A Man a plan Panama", "####", 5);
		System.out.print(inserted);
	}

	public static String strngFix(String string1, String string2, int position) {
		String amended = "";
		int lenf = string1.length();
		if (position > 0 && position <= lenf) {
			amended = string1.substring(0, position) + string2 + string1.substring(position + 1, lenf);
		}
		if (position > lenf) {
			amended = string1 + string2;
		}
		if (position <= 0) {
			amended = string2 + string1;
		}

		return amended;
	}
}

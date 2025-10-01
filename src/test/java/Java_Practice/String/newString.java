package String;

public class newString {

	public static void main(String[] args) {
		String str = "Ritesh";
		char[] res = str.toCharArray();
		res[0] = 'h';
		for (int i = 0; i < res.length; i++) {
			if (res[i] == 's') {
				break;
			} else {
				System.out.println(res[i]);
			}
		}
	}
//['R','i','t','e','s','h']
}

package youngbin;

public class Solution39 {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
		String[] str = s.split("");
		int asci_num = -1;
		
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(" "))
				continue;
			asci_num = ((int)s.charAt(i))+n;
			if(((int)s.charAt(i)) < 91 && asci_num > 90) {
				asci_num = 65 + asci_num%91;
			}
			if(((int)s.charAt(i)) > 96 && asci_num >122) {
				asci_num = 97 + asci_num%123;
			}
			str[i] = Character.toString(((char)asci_num));
		}
		
		for(int i = 0; i < str.length; i++) {
			answer += str[i];
		}

	}

}

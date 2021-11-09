package youngbin;

public class Solution38 {

	public static void main(String[] args) {
		String s = "one4seveneight";
		String[] s_arr = s.split("[0-9]");
		
		for(int i = 0; i < s_arr.length; i++) {
			System.out.println(s_arr[i]);
		}

	}

}

package youngbin;

public class Solution40 {

	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		//1step
		new_id = new_id.toLowerCase();
		//2step
		new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
		System.out.println("0 "+new_id);
		//3step
		new_id = new_id.replaceAll("[.]+", ".");
		System.out.println("0 "+new_id);
		//4step
		if(Character.toString(new_id.charAt(0)).equals(".")) {
			new_id = new_id.substring(1);
			System.out.println("1 "+new_id);
		}else if(Character.toString(new_id.charAt(new_id.length()-1)).equals(".")) {
			System.out.println("2 "+new_id);
			new_id = new_id.substring(0,new_id.length()-1);
			System.out.println("2 "+new_id);
		}
		//5step
		if(new_id.trim().isEmpty() == true) {
			new_id = "a";
			System.out.println("3 "+new_id);
		}
		//6step
		if(new_id.length() > 15) {
			new_id = new_id.substring(0,15);
			System.out.println("4 "+new_id);
		}
		if(new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0,new_id.length()-1);
			System.out.println("5 "+new_id);
		}
		//7step
		if(new_id.length() < 3) {
			while(new_id.length() != 3) {
				new_id += Character.toString(new_id.charAt(new_id.length()-1));
			}
		}
		System.out.println(new_id);

	}

}

package youngbin;

public class Solution38 {

	public static void main(String[] args) {
		String s = "one4seveneight";
		String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
		for (int i = 0; i < word.length; i++) {
            s = s.replaceAll(word[i], String.valueOf(i));
        }
        
		System.out.println(Integer.parseInt(s));

	}

}

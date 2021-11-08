package youngbin;


public class Solution21 {

	public static void main(String[] args) {
		
		
		String s = "aAaAa ZSDASD";
		
		String answer = "";
        String[] str_arr = s.split("");
        
        int index = 0;
        for(int i=0; i<str_arr.length; i++) {
            if(str_arr[i].equals(" ")) {
            	index = 0;
            } else if(index % 2 == 0) {
            	str_arr[i] = str_arr[i].toUpperCase();
            	index++;
            } else if(index % 2 != 0) {
            	str_arr[i] = str_arr[i].toLowerCase();
            	index++;
            }
            answer += str_arr[i];
        } 
        
        System.out.println(answer);
        
    }
		

	
}

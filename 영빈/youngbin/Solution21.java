package youngbin;


public class Solution21 {

	public static void main(String[] args) {
		
		
		String s = "aAaAa ZSDASD";
		
		String answer = "";
        String[] str_arr = s.split(""); //string을 string배열로 바꾸어 준다.
        
        int index = 0;
        for(int i=0; i<str_arr.length; i++) {
            if(str_arr[i].equals(" ")) {
            	index = 0; //공백이나오면 인덱스 초기화
            } else if(index % 2 == 0) {
            	str_arr[i] = str_arr[i].toUpperCase(); //짝수번의 인덱스라면 대문자로 바꾸어준다.
            	index++;
            } else if(index % 2 != 0) {
            	str_arr[i] = str_arr[i].toLowerCase(); //짝수번의 인덱스라면 문자로 바꾸어준다.
            	index++;
            }
            answer += str_arr[i]; //answer에 string배열 하나씩 붙혀준다.
        } 
        
        System.out.println(answer);
        
    }
		

	
}

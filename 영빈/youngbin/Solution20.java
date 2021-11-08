package youngbin;


public class Solution20 {

	public static void main(String[] args) {
		 String[] participant = {"leo", "kiki", "eden"};
		 String[] completion = {"eden", "kiki"};
		 String answer = "";
		 
		 for(int i=0; i<participant.length; i++)
	        {
	            for(int j=0; j<completion.length;j++)
	            {
	                if(participant[i].equals(completion[j]))
	                {
	                    completion[j]="";  //중복된 이름때문에 없애준다.
	                    break;
	                }
	                else if( j==completion.length-1 ) 
	                {
	                    answer = participant[i];
	                }

	            }

	        }
		 
		 
		
	     System.out.println(answer);

	}

}

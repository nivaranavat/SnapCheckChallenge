package snapcheckchallenge;
import java.lang.Math; 


public class Encryption {
	
	public String encrypt(String s) {
		/*
		 * Find the encoded message of the string s
		 */
		if(s==null) {
			throw new NullPointerException("You inputed a null string");
		}
		
		// Find the length of the string s  that was inputed
		int L = s.length();
		
		
		//check the constraint that the string is in the right length
		assert(1<=L && L<=81);
		
		int min_size = (int) Math.floor(Math.sqrt(L));
		int max_size = (int) Math.ceil(Math.sqrt(L));
	
		
		int min_area = max_size*max_size;
		
		String encoded_message = "";
		
		
		//will check all combinations to see which will give the minimum area
		for(int rows=min_size; rows<=max_size; rows++) {
			for(int cols = rows; cols<=max_size; cols++) {
				
				//check that the area is in the constraint
				if(rows*cols>=L && rows*cols<=min_area) {
					encoded_message = "";
					
					
					//edge case if rows is too small to encode it
					if(rows == 1) {
						return s;
					}
					
					for(int i=0; i<cols; i++) {
						for(int j=i; j<L;j+=cols) {
							char ch = s.charAt(j);
							int ascii = ch;	
							
							//check the ascii is in the right range in case of wrong input
							assert(97<=ascii && ascii<=122);
							
							//add to the message
							encoded_message+=ch;
						}
						encoded_message+=" ";
						
					}
				min_area = rows*cols;
				}
			}
		}
		
		//return message
		//remove the last character since it is a extra space character that got added
		return encoded_message.substring(0,encoded_message.length()-1);
	}
	
	

}

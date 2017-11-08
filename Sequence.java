package solutions.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {
	
	public static void main(String[] args) {
		 InputStreamReader reader = new InputStreamReader(System.in);
		    BufferedReader in = new BufferedReader(reader);
		    try {
				int no = Integer.parseInt(in.readLine().toString());
				System.out.println(getNumber(no));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		    
		}
	
	private static char getNumber(int no) {
		StringBuffer currentSequence = new StringBuffer("0");
	
		while((currentSequence.toString().length()) <= no){
			StringBuffer tempSeq = new StringBuffer();
			char[] numbers = currentSequence.toString().toCharArray();
			for (char c : numbers) {
				if(c == '0'){
					tempSeq.append("1");
				}else if(c=='1'){
					tempSeq.append("2");
				}else if(c =='2'){
					tempSeq.append("0");
				}
					
			}
			currentSequence.append(tempSeq.toString());
		}
		System.out.println(currentSequence);
		
		char index=currentSequence.toString().charAt(no);
		
		return index;
	}

}

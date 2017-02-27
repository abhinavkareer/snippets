package BattleGround;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VowelPhelia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D://testCases//vowels//2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	        line = br.readLine();
	        int stringLength=Integer.parseInt(line);
	        
	        String str=br.readLine();
	        System.out.print(str+" : ");
	        if(stringLength>=3 )
	        System.out.println(getTheCount(str,3,stringLength));
	        else
	        System.out.println(0);	
	        }
			

		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}
	

    public static int getTheCount(String str,int N,int len){
		String myStr=str.toLowerCase();
    	int count=0;
		int normalChars=0,oldNormalChars=0,normalCharsAfter=0;
		int firstVowelCharIndex=0;
		int secondVowelCharIndex=0;
		int thirdVowelCharIndex=0;
		int vowelPosCounter=0;
		if(myStr.length()<N )return count;
		for (int i = 0; i < str.length(); i++) {
			normalCharsAfter=0;
			char ch = myStr.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelPosCounter++;
				if(vowelPosCounter==1)
				{
					normalChars=firstVowelCharIndex=i;
					
				}else if(vowelPosCounter==2)
				{
					secondVowelCharIndex=i;
				}else if(vowelPosCounter==3)
				{
					if(thirdVowelCharIndex!=0)
					{
						normalCharsAfter=i-thirdVowelCharIndex-1;
						count=count+normalCharsAfter+(oldNormalChars*normalCharsAfter);
					}
					oldNormalChars=normalChars;
					count=count+1+normalChars;
					normalChars=secondVowelCharIndex-firstVowelCharIndex-1;
					thirdVowelCharIndex=i;
					firstVowelCharIndex=secondVowelCharIndex;
					secondVowelCharIndex=thirdVowelCharIndex;
					vowelPosCounter=2;
				}
			
			}
		
		}
		
		
		if(thirdVowelCharIndex<(len-1) && thirdVowelCharIndex!=0)
		{
			normalCharsAfter=len-1-thirdVowelCharIndex;
			count=count+(oldNormalChars*normalCharsAfter)+normalCharsAfter;
		}
		
		return count;
	}
	
	
}

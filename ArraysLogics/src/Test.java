import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	    int[] arr = {1};
	    allPairsXor(arr,1);
	}

	 private static void allPairsXor(int [] myArray,int len) {
		   boolean first=true;
		   int allXors=0;
		   if(len==1)
		   {
		     allXors =myArray[0]; 
		   }
		    for (int i = 0; i < len; i++) {
		    	int xor=myArray[0];
		        boolean first1=true;
			    
		    	for (int j = i; j < len; j++) {
		    		 for (int k=i; k<=j; k++)
		    		{
		    			 System.out.print(myArray[k]);
		    			if(!first1){
		    			 xor=xor^myArray[k];
		    			
		    			   
		    			}
		    			else{ first1=!first1;}
		    		}
		    		 if(!first){
		    		 allXors=allXors^xor;
		    		 
		    		 }
		    		 else
		    		 {
		    		     first1=!first;
		    		 }
		        }
		    	
		    }
		    System.out.println();
		    System.out.println(allXors);
		   
		}
	
	
	
}

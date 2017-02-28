/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    
    	static class DigitAndSum{
		int num,sum;
		
		DigitAndSum(int num,int sum){
			this.num=num;
			this.sum=sum;
		}

		/**
		 * @return the num
		 */
		public int getNum() {
			return num;
		}

		/**
		 * @param num the num to set
		 */
		public void setNum(int num) {
			this.num = num;
		}

		/**
		 * @return the sum
		 */
		public int getSum() {
			return sum;
		}

		/**
		 * @param sum the sum to set
		 */
		public void setSum(int sum) {
			this.sum = sum;
		}
		
		
		
	}
    
    
    
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();
        int Q = Integer.parseInt(line);
    
        line = br.readLine();
        System.out.println(line);
        String NumbArray[]=line.split(" ");
		DigitAndSum myArr[]=new DigitAndSum[N];
			System.out.println(NumbArray);
		for(int j=0;j<Q;j++){
			int myNumb=Integer.parseInt(NumbArray[j]);
		
		myArr[j]=new DigitAndSum(myNumb,sumOfDigits(myNumb));
		}
    

       

        for (int i = 0; i < Q; i++) {
              line = br.readLine();
              String indexArr[]=line.split(" ");
              int index1=Integer.parseInt(NumbArray[0])-1;
              int index2=Integer.parseInt(NumbArray[1])-1;
              
              
              
              
              System.out.println(myArr[index1].getSum()+myArr[index2].getSum());
              
        }
       

        
    }
    
    
    
    
    
    public static int sumOfDigits(int  numb)
	{
		int sum=0;
		if(numb<10)
		{
			return numb;
		}
		else
		{
			
			int rem=0,div=numb;
			
			while(div>0){
			rem=div%10;
			sum=sum+rem;
			div=div/10;
			}
			
			sum=sumOfDigits(sum);
		}
		
		
		
		return sum;
	}
    
    
    
    
}

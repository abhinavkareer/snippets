package algo;

public class MaxBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countTrees(3);
		
	}

	
	
	public static int countTrees(int n)
	{
		int count =1;
		
		if(n>1)
		{
			int sum,left,right;
			sum=left=right=0;
			for (int k=1;k<=n;k++)
			{
				left=countTrees(k-1);
				right=countTrees(n-k);
				sum+=left*right;
			}
			count=sum;
		}
		
		System.out.println(count +" Binary trees for "+n+"elements");
		return count;
		
		
	}
	
	
	
}

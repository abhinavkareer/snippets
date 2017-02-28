import java.util.Comparator;

public class JournalComparator implements Comparator{

	public int compare(Object o1,Object o2){  
		Journal j1=(Journal)o1;  
		Journal j2=(Journal)o2;  
		  
		
		if(j1.score==j2.score){
			return j1.name.compareTo(j2.name);
		}
		else if(j1.score>j2.score){
		return -1;	
		}
		else
		{
			return 1;
		}
		
	}
	
}

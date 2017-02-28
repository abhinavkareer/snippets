import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author AKareer
 *
 */
public class JournalSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Journal j1=new Journal( 9.9, false, "A");
		Journal j2=new Journal( 4, false, "BC");
		Journal j3=new Journal( 4, false, "CB");
		
		ArrayList jList=new ArrayList();  

		jList.add(j1);
		jList.add(j3);
		jList.add(j2);
		
		Collections.sort(jList,new JournalComparator());  
		
		System.out.println("Rank \t Name \t Score");
		Iterator itr=jList.iterator();  
		double prevScore=0;
		int rank=0;
		while(itr.hasNext()){  
			Journal jItem=(Journal)itr.next();
			if(prevScore!=jItem.score){
				rank++;
				prevScore=jItem.score;
			}
			jItem.rank=rank;
			if(!jItem.review)
			System.out.println(jItem.rank+" \t "+jItem.name+" \t "+jItem.score);  
		}  
		
		
		
	}

}

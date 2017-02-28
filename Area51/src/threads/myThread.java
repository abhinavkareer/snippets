package threads;
import java.util.concurrent.Callable;

public class myThread implements Runnable {

	private int cntr=0;
	private boolean firstTime=true;
	private String command;
	
	public myThread(String s){
        this.command=s;
    }
	
	public void call()
	{
		if(firstTime)
		{
			Thread testThread=new Thread();
			testThread.start();
			System.out.println("Thread ran for first time here!");
			firstTime=false;
		}
		System.out.println("call method invoked - myThread");
	
	}
	
	public void run() {
		
		while(true)
		{
			cntr++;
			
			
			System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
			
			System.out.println(Thread.currentThread().getName()+ " Cycle :"+ cntr);
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

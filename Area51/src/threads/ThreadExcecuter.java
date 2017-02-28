package threads;
import java.awt.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExcecuter {
	
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		executorService.submit(new Runnable() {
//		    public void run() {
//		      myThread mt=new myThread();
//		      
//		    }
//		});
		
		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
            Runnable worker = new myThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

	
		
	}

}

package Multi_threading;

public class MyThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<2;i++)
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
				
		MyThread t0=new MyThread();// new state
		
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t0.start();
		t2.join();
		t1.start();
		
		t2.start();
		//t0.join();
		
        
	}

}

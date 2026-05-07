package Multi_threading;

public class TestThread implements Runnable{
	public void run() {
		for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+"="+i);
           System.out.println(Thread.currentThread());
        }
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		TestThread t0=new TestThread();
		t0.run();
		TestThread t1=new TestThread();
		t1.run();
		System.out.println(t0.equals(t1));
	

	}

	
	

}

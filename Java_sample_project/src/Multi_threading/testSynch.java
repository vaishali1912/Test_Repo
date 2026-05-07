package Multi_threading;

public class testSynch extends Thread {
	int count=0;
	synchronized void count()
	{
		count++;
	}

	public static void main(String[] args) {
		testSynch t1=new testSynch();
		t1.count();
		testSynch t2=new testSynch();
		t2.count();
		
		// vector sychronized
		
		//54321

	}

}

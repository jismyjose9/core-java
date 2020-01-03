package Multithreading;

public class Daemonthread extends Thread {
	
	  public void run()
	  {
		  if(Thread.currentThread().isDaemon())//checking for daemon thread
		  {
			  System.out.println("Daemon thread work.");
		  }
		  else
		  {
			  System.out.println("user thread work."); 
		  }
	  }
	public static void main(String args[])
	{
		Daemonthread t1=new Daemonthread();//creating thread
		Daemonthread t2=new Daemonthread();
		Daemonthread t3=new Daemonthread();
		t1.setDaemon(true);//now t1 is daemon thread
		t1.start();//starting threads
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
	}

}

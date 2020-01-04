package Multithreading;

public class DaemonthreadExample extends Thread
{
	public void run()
	{
		System.out.println("Thread name: "+Thread.currentThread().getName());
		System.out.println("check if its DaemonThread: "+Thread.currentThread().isDaemon());
	}
    public static void main(String args[])
     {
    	DaemonthreadExample t1=new DaemonthreadExample();//Daemonthread variable created
    	DaemonthreadExample t2=new DaemonthreadExample();//Daemonthread variable created
    	
    	
    	t1.start();
    	//Exception as the thread is already started
    	t1.setDaemon(true);
    	t2.start();
    	
	
}
}

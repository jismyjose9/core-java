package Multithreading;
public class ThreadPriority extends Thread {
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
		
	}

	public static void main(String args[])
	{
		ThreadLocal <Number> obj_local=new ThreadLocal <Number>();//creating ThreadLocal variable
		ThreadLocal <String> obj=new ThreadLocal <String>();//creating ThreadLocal variable string type
		obj_local.set(100);//set the value to the ThreadLocal variable
		System.out.println("value = " + obj_local.get());
		obj_local.set(90);
		System.out.println("value = " + obj_local.get());
		obj.set("java");//set the value to the ThreadLocal variable
		System.out.println("value = " + obj.get());
		obj.remove();
		System.out.println("value = " + obj.get());
		obj_local.remove();
		System.out.println("value = " + obj_local.get());
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		t1.setPriority(Thread.MIN_PRIORITY);//set MIN_PRIORITY
		t2.setPriority(Thread.MAX_PRIORITY);//set MAX_PRIORITY
		t1.start();
		t2.start();
		
		
		
		
	}
}

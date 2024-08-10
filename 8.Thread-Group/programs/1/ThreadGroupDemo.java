public class ThreadGroupDemo 
{ 
	public static void main(String arg[]) 
	{ 
		// creating the thread group 
		ThreadGroup group1 = new ThreadGroup("parent thread group"); 

		NewThread t1 = new NewThread("one", group1); 
		System.out.println("Starting one"); 
		NewThread t2 = new NewThread("two", group1); 
		System.out.println("Starting two"); 

		// checking the number of active thread 
		System.out.println("number of active thread: "
						+ group1.activeCount()); 
	} 
} 

// Java code illustrating activeCount() method 
import java.lang.*; 

class NewThread extends Thread 
{ 
	NewThread(String threadname, ThreadGroup tgob) 
	{ 
		super(tgob, threadname); 
		start(); 
	} 
public void run() 
	{ 

		for (int i = 0; i < 1000; i++) 
		{ 
			try
			{ 
				Thread.sleep(10); 
			} 
			catch (InterruptedException ex) 
			{ 
				System.out.println("Exception encounterted"); 
			} 
		} 
	} 
} 

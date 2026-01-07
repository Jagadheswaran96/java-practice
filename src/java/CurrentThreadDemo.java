package java;

//Controlling the main Thread.
class CurrentThreadDemo {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		//Obtain a thread’s name
		String threadName = t.getName();
		System.out.println("Current thread name: " + threadName);
		//Obtain a thread’s priority
		int threadPriority = t.getPriority();
		System.out.println("Current thread priority: " + threadPriority);
		//Determine if a thread is still running
		boolean threadAlive = t.isAlive();
		System.out.println("Curren thread alive: " + threadAlive);		
		//change the name of the thread
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}

package Day12.demo;
public class ThreadsSimpleTask  implements Runnable{

	private long sleepTime;

	public ThreadsSimpleTask(long sleepTime) {
		super();
		this.sleepTime = sleepTime;
	}
  //logic
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Simple task is running on " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

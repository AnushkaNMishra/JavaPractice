import java.util.LinkedList;
import java.util.*;

public class ProducerConsumer {
	public static void main(String[] args)
		throws InterruptedException
	{
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}


	public static class PC {

		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		public void produce() throws InterruptedException
		{
			int value = 0;
			while (true) {
				synchronized (this)
				{

					while (list.size() == capacity)
						wait();

					System.out.println("Producer produced-"
									+ value);

					list.add(value++);


					notify();
					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{

					while (list.size() == 0)
						wait();

					// to retrieve the first job in the list
					int val = list.removeFirst();

					System.out.println("Consumer consumed-"
									+ val);

					// Wake up producer thread
					notify();

					// and sleep
					Thread.sleep(1000);
				}
			}
		}
	}
}

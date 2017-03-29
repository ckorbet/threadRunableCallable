package ctorresg.threadrunablecallable.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainThreads {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainThreads.class);

	public static final void main(final String args[]) throws InterruptedException{
		final Thread mft = new MyFirstThread("MyFirstThread");
		final Thread mst = new MySecondThread("MySecondThread");
		mft.start();
		mst.start();
		for (int i = 1; i <= 20; i++) {
			LOGGER.info("I AM IN main " + i + " ###################");
			Thread.sleep(500);
		}
	}

}

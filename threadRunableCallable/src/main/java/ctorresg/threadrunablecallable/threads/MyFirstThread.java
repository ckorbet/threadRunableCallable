package ctorresg.threadrunablecallable.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstThread extends Thread {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyFirstThread.class);

	public MyFirstThread() {
		super();
	}

	public MyFirstThread(final String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for(int i=1; i<=20; i++){
			LOGGER.info(this.getClass().getSimpleName() + "  " + i);
			try {
				MyFirstThread.sleep(500);
			} catch (final InterruptedException iExcp) {
				LOGGER.error("", iExcp);
			}
		}
	}
}

package ctorresg.threadrunablecallable.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyComposedThread extends Thread {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyComposedThread.class);

	public MyComposedThread() {
		super();
	}

	public MyComposedThread(final String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for(int i=1; i<=20; i++){
			LOGGER.info(this.getClass().getSimpleName() + "  " + i);
			try {
				MyComposedThread.sleep(500);
			} catch (final InterruptedException iExcp) {
				LOGGER.error("", iExcp);
			}
		}
	}

}

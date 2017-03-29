package ctorresg.threadrunablecallable.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelfThread extends Thread {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyFirstThread.class);

	public SelfThread() {
		super();
	}

	public SelfThread(final String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		final Thread sth = new SelfThread("SelfThread");
		sth.run();
		LOGGER.info(this.getClass().getSimpleName());
	}

}

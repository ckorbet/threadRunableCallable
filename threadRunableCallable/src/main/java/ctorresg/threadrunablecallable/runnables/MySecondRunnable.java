package ctorresg.threadrunablecallable.runnables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySecondRunnable implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(MySecondRunnable.class);

	@Override
	public void run() {
		for(int i=1; i<=20; i++){
			LOGGER.info(this.getClass().getSimpleName() + " " + i);
		}
	}

}

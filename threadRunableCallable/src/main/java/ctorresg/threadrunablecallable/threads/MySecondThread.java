package ctorresg.threadrunablecallable.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySecondThread extends Thread {

	private static final Logger LOGGER = LoggerFactory.getLogger(MySecondThread.class);



	public MySecondThread() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MySecondThread(final String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		for(int i=1; i<=20; i++){
			LOGGER.info(this.getClass().getSimpleName() + " " + i);
			try {
				MySecondThread.sleep(500);
			} catch (final InterruptedException iExcp) {
				LOGGER.error("", iExcp);
			}
		}
	}

}

package ctorresg.threadrunablecallable.callables;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySecondCallable implements Callable<String> {

	private static final Logger LOGGER = LoggerFactory.getLogger(MySecondCallable.class);

	@Override
	public String call() throws Exception {
		for(int i=1; i<=20; i++){
			LOGGER.info(this.getClass().getSimpleName() + "  " + i);
		}
		return null;
	}

}

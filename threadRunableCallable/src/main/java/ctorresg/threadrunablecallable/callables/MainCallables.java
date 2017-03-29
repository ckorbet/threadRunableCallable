package ctorresg.threadrunablecallable.callables;

import java.util.concurrent.Callable;

public class MainCallables {

	public static final void main(final String args[]) throws Exception{
		final Callable<String> mfc = new MyFirstCallable();
		final Callable<String> msc = new MySecondCallable();
		mfc.call();
		msc.call();
	}
}

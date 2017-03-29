package ctorresg.threadrunablecallable.runnables;

public class MainRunnables {

	public static final void main(final String[] args) {
		final Runnable mfr = new MyFirstRunnable();
		final Runnable msr = new MySecondRunnable();
		mfr.run();
		msr.run();
	}

}

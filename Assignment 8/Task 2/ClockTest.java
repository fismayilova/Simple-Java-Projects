package task2_clock;

import acm.program.GraphicsProgram;

public class ClockTest extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final int APPLICATION_WIDTH = 700;
	static final int APPLICATION_HEIGHT = 500;

	public void run() {
		Clock clock = new Clock(18, 45);
		add(clock);
		clock.moveClock();

	}

	public static void main(String[] args) {
		new ClockTest().start();
	}
}

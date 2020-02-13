package task3_train;

import java.awt.Color;

import acm.program.GraphicsProgram;

public class TrainTest extends GraphicsProgram {
	private static final long serialVersionUID = 1L;

	public void run() {
		double xc = getWidth() / 2;
		Train train = new Train();
		train.append(new Engine());
		train.append(new BoxCar(Color.GREEN));
		train.append(new BoxCar(Color.BLUE));
		train.append(new Caboose());

		add(train, xc - train.getWidth() / 2, getHeight());

		waitForClick();
		while (train.getX() + train.getWidth() >= 0) {
			train.move(-DELTA_X, 0);
			for (int i = 0; i < TrainCar.wheels.size(); i++) {
				TrainCar.wheels.get(i).rotate(13);
			}
			pause(PAUSE_TIME);
			if (!(train.getX() + train.getWidth() >= 0)) {
				train.setLocation(getWidth(), getHeight());
			}
		}
	}

	public static void main(String[] args) {
		new TrainTest().start();
	}

	/* Private constants */
	private static final double PAUSE_TIME = 20;
	private static final double DELTA_X = 2;

}

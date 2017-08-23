package fruitbasket.designmodel.state;

/**
 * ÔËÐÐ×´Ì¬
 * @author FruitBasket
 *
 */
public class RunningState extends LiftState {

	@Override
	public void open() {
	}

	@Override
	public void close() {
	}

	@Override
	public void run() {
		System.out.println("RunningState.run()");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPING_STATE);
		super.context.getLiftState().stop();
	}

}

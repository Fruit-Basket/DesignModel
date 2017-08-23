package fruitbasket.designmodel.state;

/**
 * ֹͣ״̬
 * @author FruitBasket
 *
 */
public class StoppingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.OPEN_STATE);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.CLOSING_STATE);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("StoppingState.stop()"); 
	}

}

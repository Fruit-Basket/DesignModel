package fruitbasket.designmodel.state;

/**
 * 开门状态
 * @author FruitBasket
 *
 */
public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("OpenningState.open()");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.CLOSING_STATE);
		//动作委托CloseState来执行
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
	}

	@Override
	public void stop() {
	}

}

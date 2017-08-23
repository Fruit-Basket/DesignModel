package fruitbasket.designmodel.state;

/**
 * 关闭状态
 * @author FruitBasket
 *
 */
public class ClosingState extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.OPEN_STATE);
		//动作委托OpenState来执行
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("ClosingState.open()");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		//动作委托RunningState来执行
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPING_STATE);
		super.context.getLiftState().stop();
	}
	
}

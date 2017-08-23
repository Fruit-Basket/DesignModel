package fruitbasket.designmodel.state;

/**
 * �ر�״̬
 * @author FruitBasket
 *
 */
public class ClosingState extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.OPEN_STATE);
		//����ί��OpenState��ִ��
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("ClosingState.open()");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		//����ί��RunningState��ִ��
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPING_STATE);
		super.context.getLiftState().stop();
	}
	
}

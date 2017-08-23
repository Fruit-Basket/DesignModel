package fruitbasket.designmodel.state;

/**
 * ����״̬
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
		//����ί��CloseState��ִ��
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
	}

	@Override
	public void stop() {
	}

}

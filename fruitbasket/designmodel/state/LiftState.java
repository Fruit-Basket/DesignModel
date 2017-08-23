package fruitbasket.designmodel.state;

/**
 * �������״̬
 * @author FruitBasket
 *
 */
public abstract class LiftState {
	
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * ִ�п�������
	 */
	public abstract void open();
	
	/**
	 * ִ�йرն���
	 */
	public abstract void close();
	
	/**
	 * ִ�����ж���
	 */
	public abstract void run();
	
	/**
	 * ִ�йرն���
	 */
	public abstract void stop();
}

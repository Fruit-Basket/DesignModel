package fruitbasket.designmodel.state;

/**
 * 抽象电梯状态
 * @author FruitBasket
 *
 */
public abstract class LiftState {
	
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * 执行开启动作
	 */
	public abstract void open();
	
	/**
	 * 执行关闭动作
	 */
	public abstract void close();
	
	/**
	 * 执行运行动作
	 */
	public abstract void run();
	
	/**
	 * 执行关闭动作
	 */
	public abstract void stop();
}

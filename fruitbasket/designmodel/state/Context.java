package fruitbasket.designmodel.state;

/**
 * ��������
 * @author FruitBasket
 *
 */
public class Context {

	//��������е��ݵ�״̬
	public final static OpenningState OPEN_STATE=new OpenningState();
	public final static ClosingState CLOSING_STATE=new ClosingState();
	public final static RunningState RUNNING_STATE=new RunningState();
	public final static StoppingState STOPING_STATE=new StoppingState();
	
	//���嵱ǰ��״̬
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		this.liftState.setContext(this);
	}
	
	public void open(){
		liftState.open();
	}
	
	public void close(){
		liftState.close();
	}
	
	public void run(){
		liftState.run();
	}
	
	public void stop(){
		liftState.stop();
	}
}

package fruitbasket.designmodel.state;

final public class Client {

	public static void test(){
		Context context=new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}

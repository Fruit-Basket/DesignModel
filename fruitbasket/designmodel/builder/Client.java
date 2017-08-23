package fruitbasket.designmodel.builder;

final public class Client {
	
	public static void test(){
		Director director=new Director();
		
		director.getABenzModel().run();
		System.out.println();
		director.getBBenzModel().run();
		System.out.println();
		director.getCBMWModel().run();
	}

}

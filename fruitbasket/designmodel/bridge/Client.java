package fruitbasket.designmodel.bridge;

final public class Client {
	
	public static void test(){
		House house=new House();
		
		HouseCorp houseCorp=new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
		ShanZhaiCorp shanZhaiCorp=new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}
}

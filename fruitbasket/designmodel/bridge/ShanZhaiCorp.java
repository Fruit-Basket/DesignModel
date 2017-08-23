package fruitbasket.designmodel.bridge;

import fruitbasket.designmodel.bridge.Corp;

public class ShanZhaiCorp extends Corp {

	public ShanZhaiCorp(Product product) {
		super(product);
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("ShanZhaiCorp.makeMoney()");
	}
}

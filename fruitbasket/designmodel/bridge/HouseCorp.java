package fruitbasket.designmodel.bridge;

import fruitbasket.designmodel.bridge.Corp;

public class HouseCorp extends Corp {

	public HouseCorp(House house) {
		super(house);
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("HouseCorp.makeMoney()");
	}

}

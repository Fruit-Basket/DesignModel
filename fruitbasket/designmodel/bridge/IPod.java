package fruitbasket.designmodel.bridge;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("IPod.beProducted()");
	}

	@Override
	public void beSelled() {
		System.out.println("IPod.beSelled()");
	}

}

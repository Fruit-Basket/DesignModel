package fruitbasket.designmodel.bridge;

/**
 * 抽象公司类
 * @author FruitBasket
 *
 */
public class Corp {

	private Product product;
	
	public Corp(Product product){
		this.product=product;
	}

	public void makeMoney(){
		product.beProducted();
		product.beSelled();
	}
}

package fruitbasket.designmodel.visitor;

/**
 * 普通员工
 * @author FruitBasket
 *
 */
public class CommonEmployee extends Employee {
	
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);//visitor访问本对象
	}

}

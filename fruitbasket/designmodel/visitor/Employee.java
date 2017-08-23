package fruitbasket.designmodel.visitor;

/**
 * 员工
 * @author FruitBasket
 *
 */
public abstract class Employee {

	public final static int MALE=0;
	public final static int FEMALE=1;
	
	private String name;
	private int salary;
	private int sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	/**
	 * 定义允许这个访问者访问
	 * @param visitor 指定一个访问者
	 */
	public abstract void accept(IVisitor visitor);
}

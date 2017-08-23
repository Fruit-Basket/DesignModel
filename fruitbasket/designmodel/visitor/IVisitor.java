package fruitbasket.designmodel.visitor;

/**
 * 访问者
 * @author FruitBasket
 *
 */
public interface IVisitor {
	
	/**
	 * 定义这个访问者可以访问普通员工
	 * @param commonEmployee
	 */
	public void visit(CommonEmployee commonEmployee);
	
	/**
	 * 定义这个访问者可以访问部门经理
	 * @param manager
	 */
	public void visit(Manager manager);
}

package fruitbasket.designmodel.visitor;

/**
 * ������
 * @author FruitBasket
 *
 */
public interface IVisitor {
	
	/**
	 * ������������߿��Է�����ͨԱ��
	 * @param commonEmployee
	 */
	public void visit(CommonEmployee commonEmployee);
	
	/**
	 * ������������߿��Է��ʲ��ž���
	 * @param manager
	 */
	public void visit(Manager manager);
}

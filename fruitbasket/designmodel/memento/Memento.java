package fruitbasket.designmodel.memento;

/**
 * ����
 * @author FruitBasket
 *
 */
public class Memento {
	
	//���ڴ��һ������״̬
	private String state="";
	
	public Memento(String state){
		this.state=state;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state=state;
	}

}

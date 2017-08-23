package fruitbasket.designmodel.memento;

/**
 * 备忘
 * @author FruitBasket
 *
 */
public class Memento {
	
	//用于存放一个备份状态
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

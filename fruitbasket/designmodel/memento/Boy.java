package fruitbasket.designmodel.memento;

public class Boy {
	private String state="";
	
	public void changeState(){
		state="My mood is not very  good";
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state=state;
	}
	
	/**
	 * 利用现在的状态，创建备忘
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/**
	 * 从备份中，恢复一个状态
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		setState(memento.getState());
	}
}

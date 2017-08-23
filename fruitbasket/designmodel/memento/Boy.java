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
	 * �������ڵ�״̬����������
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/**
	 * �ӱ����У��ָ�һ��״̬
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		setState(memento.getState());
	}
}

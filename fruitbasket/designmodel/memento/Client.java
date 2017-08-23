package fruitbasket.designmodel.memento;

public class Client {

	public static void test(){
		Boy boy=new Boy();
		Caretaker caretaker=new Caretaker();//创建一个备份管理者 
		
		boy.setState("My mood is very good!");
		System.out.println("The initial state: "+boy.getState());
		caretaker.setMemento(boy.createMemento());
		
		boy.changeState();
		System.out.println("the state after changed: "+boy.getState());
		
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("the restore state: "+boy.getState());
		
	}
	
	public static void test2(){
		Originator ori=new Originator();//发起人角色
		Caretaker2 caretaker2=new Caretaker2();//备忘录管理员
		
		//初始状态
		ori.setState1("China");
		ori.setState2("happy");
		ori.setState3("big");
		
		System.out.println("begin:");
		System.out.println(ori);
		System.out.println();
		
		caretaker2.setMemento2(ori.createMemento());//创建一个备份
		
		//修改状态
		ori.setState1("软件");
		ori.setState2("鲁棒的");
		ori.setState3("健壮的");
		System.out.println("after modified:");
		System.out.println(ori);
		System.out.println();
		
		ori.restoreMemento(caretaker2.getMemento2());
		System.out.println("after restore:");
		System.out.println(ori);
	}
}

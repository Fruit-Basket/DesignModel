package fruitbasket.designmodel.memento;

public class Client {

	public static void test(){
		Boy boy=new Boy();
		Caretaker caretaker=new Caretaker();//����һ�����ݹ����� 
		
		boy.setState("My mood is very good!");
		System.out.println("The initial state: "+boy.getState());
		caretaker.setMemento(boy.createMemento());
		
		boy.changeState();
		System.out.println("the state after changed: "+boy.getState());
		
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("the restore state: "+boy.getState());
		
	}
	
	public static void test2(){
		Originator ori=new Originator();//�����˽�ɫ
		Caretaker2 caretaker2=new Caretaker2();//����¼����Ա
		
		//��ʼ״̬
		ori.setState1("China");
		ori.setState2("happy");
		ori.setState3("big");
		
		System.out.println("begin:");
		System.out.println(ori);
		System.out.println();
		
		caretaker2.setMemento2(ori.createMemento());//����һ������
		
		//�޸�״̬
		ori.setState1("���");
		ori.setState2("³����");
		ori.setState3("��׳��");
		System.out.println("after modified:");
		System.out.println(ori);
		System.out.println();
		
		ori.restoreMemento(caretaker2.getMemento2());
		System.out.println("after restore:");
		System.out.println(ori);
	}
}

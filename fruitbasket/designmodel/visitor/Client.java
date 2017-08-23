package fruitbasket.designmodel.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void test(){
		for(Employee emp:mockEmployee()){
			emp.accept(new Visitor());
		}
	}
	
	private static List<Employee> mockEmployee(){
		List<Employee> list=new ArrayList<Employee>();
		
		Manager manager=new Manager();
		manager.setName("Luffy");
		manager.setSex(Employee.MALE);
		manager.setSalary(100);
		manager.setPerformance("good");
		
		CommonEmployee commonEmployee1=new CommonEmployee();
		commonEmployee1.setName("Soro");
		commonEmployee1.setSex(Employee.MALE);
		commonEmployee1.setSalary(100);
		commonEmployee1.setJob("swordsman");
		
		CommonEmployee commonEmployee2=new CommonEmployee();
		commonEmployee2.setName("Nami");
		commonEmployee2.setSex(Employee.MALE);
		commonEmployee2.setSalary(100);
		commonEmployee2.setJob("navigator");
		
		CommonEmployee commonEmployee3=new CommonEmployee();
		commonEmployee3.setName("Sanji");
		commonEmployee3.setSex(Employee.MALE);
		commonEmployee3.setSalary(100);
		commonEmployee3.setJob("chef");
		
		return list;
	}
}

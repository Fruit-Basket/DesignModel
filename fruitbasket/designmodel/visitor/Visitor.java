package fruitbasket.designmodel.visitor;

public class Visitor implements IVisitor {
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(getCommonEmployee(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(getManager(manager));
	}
	
	/**
	 * 组装Employee的信息
	 * @param employee
	 * @return
	 */
	private String getBasicInfo(Employee employee){
		String info="Name: "+employee.getName()+"\t";
		info=info+"Sex: "+(employee.getSex()==Employee.MALE?"male":"female")+"\t";
		info=info+"Salary: "+employee.getSalary()+"\t";
		return info;
	}
	
	/**
	 * 组装CommonEmployee的信息
	 * @param commonEmployee
	 * @return
	 */
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String otherInfo="Job: "+commonEmployee.getJob()+"\t";
		return getBasicInfo(commonEmployee)+otherInfo;
	}
	
	/**
	 * 组装Manager的信息
	 * @param manager
	 * @return
	 */
	private String getManager(Manager manager){
		String otherInfo="performance: "+manager.getPerformance()+"\t";
		return getBasicInfo(manager)+otherInfo;
	}

}

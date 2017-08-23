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
	 * ��װEmployee����Ϣ
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
	 * ��װCommonEmployee����Ϣ
	 * @param commonEmployee
	 * @return
	 */
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String otherInfo="Job: "+commonEmployee.getJob()+"\t";
		return getBasicInfo(commonEmployee)+otherInfo;
	}
	
	/**
	 * ��װManager����Ϣ
	 * @param manager
	 * @return
	 */
	private String getManager(Manager manager){
		String otherInfo="performance: "+manager.getPerformance()+"\t";
		return getBasicInfo(manager)+otherInfo;
	}

}

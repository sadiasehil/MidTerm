package design;

public class FortuneEmployee extends  EmployeeInfo {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo sad2=new EmployeeInfo(111);
		sad2.departements();
		sad2.assignDepartment();
		sad2.calculateSalary();
		sad2.calculateEmployeeBonus(4);
		sad2.calculateEmployeePension();


	}

}

package PropertyPlaceholderConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");

		EmployeeDao empDao = (EmployeeDao) appContext.getBean("empDaoId");

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Tuğcan");
		emp.setSurname("Koparan");
		emp.setSalary(1111);
		empDao.hire(emp);
		
		Employee emp1 = empDao.findByName("Tuğcan");
		
		System.out.println(emp3);

	 	emp3.setSalary(15000);
		
		empDao.updateInfo(emp3);
		
		System.out.println(emp3);
		
	        empDao.discharge(emp3);

	}
}

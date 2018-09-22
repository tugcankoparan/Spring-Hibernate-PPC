package erguder.levent._22.PropertyPlaceholderConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("tutorial_22.xml");

		EmployeeDao empDao = (EmployeeDao) appContext.getBean("empDaoId");

		// insert record
		// kayit ekleyelim

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Levent");
		emp.setSurname("Erguder");
		emp.setSalary(10000);
		empDao.hire(emp);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Burak");
		emp2.setSurname("Okumus");
		emp2.setSalary(20000);
		empDao.hire(emp2);

		// select
		// kaydi sorgulayalim
		Employee emp3 = empDao.findByName("Levent");
		System.out.println(emp3);

		// update
		// guncelleme islemi yapalim
	 	emp3.setSalary(15000);
		empDao.updateInfo(emp3);
		System.out.println(emp3);

		// delete
		// silme islemi yapalim
	   empDao.discharge(emp3);

	}
}

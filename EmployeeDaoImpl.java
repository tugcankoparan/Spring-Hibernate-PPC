package PropertyPlaceholderConfigurer;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public void hire(Employee emp) {
		getHibernateTemplate().save(emp);

	}

	@Override
	public void updateInfo(Employee emp) {
		getHibernateTemplate().update(emp);

	}

	@Override
	public void discharge(Employee emp) {
		getHibernateTemplate().delete(emp);

	}

	@Override
	public Employee findByName(String name) {
		List list = getHibernateTemplate().find("from Employee where name=?", name);
		return (Employee) list.get(0);
	}

}

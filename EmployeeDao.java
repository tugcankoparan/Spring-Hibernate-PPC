package erguder.levent._22.PropertyPlaceholderConfigurer;

public interface EmployeeDao {

	void hire(Employee emp);

	void updateInfo(Employee emp);

	void discharge(Employee emp);

	Employee findByName(String name);
}

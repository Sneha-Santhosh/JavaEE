package week2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import week2.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = context.getBean("employeeInfo)", Employee.class);
		emp.printMessage();
	}
}


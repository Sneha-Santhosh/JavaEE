package week2;

public class Employee {
	String employeeName;
	String employeeLastName;

	public void setEmployeeName(String empName) {

		this.employeeName=empName;

		}
		public void setEmployeeLastName(String empLastName) {
		this.employeeLastName=empLastName;


		}
		public String getEmployeeName() {
		return employeeName;
		}

		public String getEmployeeLastName() {
		return employeeLastName;
		}
		public void printMessage() {
		System.out.println(employeeName +" "+ employeeLastName + " Welcome to Spring");
		}
	
}

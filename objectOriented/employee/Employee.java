package objectOriented.employee;

public class Employee {
    //인스턴스에서 공통으로 사용함
    public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
    //아래와 같이 이용하면 각각 인스턴스마다 다르게 할달 할 수 있음
    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}

package objectOriented.employee;

public class Employee {
    //인스턴스에서 공통으로 사용함
    private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
    //아래와 같이 이용하면 각각 인스턴스마다 다르게 할달 할 수 있음
    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    //static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
    //인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
    public static void setSerialNum(int serialNum) {
		int i = 0;
		
		employeeName = "Lee";  //오류발생
		Employee.serialNum = serialNum;
	}

    
    public int getSerialNum(){
        return serialNum;
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

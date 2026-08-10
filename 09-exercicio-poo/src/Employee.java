import javax.swing.text.html.parser.Parser;

public class Employee {
    private String employeeName;
    private int employeeID;
    private int employeeSalary;

    public Employee(){}
    public Employee(String employeeName, int employeeID, int employeeSalary){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int  getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeSalary() {
        String salary;
        return  salary = String.valueOf(this.employeeSalary);

    }
    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public void status(){
        System.out.println("Employee Name: " + this.getEmployeeName());
        System.out.println("Employee ID: " + this.getEmployeeID());
        System.out.println("Employee Salary: " + getEmployeeSalary());
    }
}

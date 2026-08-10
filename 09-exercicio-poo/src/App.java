/*
Write a Java program to create a class called
Employee with private instance variables
employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify
the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.
*/

public class App {
    public static void main(String[] args){
    Employee employee = new Employee();
    employee.status();
    employee.setEmployeeID(1);
    employee.setEmployeeName("Kawã");
    employee.setEmployeeSalary(5000);
    employee.status();
    Employee employee2 = new Employee();
    employee2.status();
    }
}

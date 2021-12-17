package a;

public class Employee {
	int age,id,salary;
	public Employee(String name){
		System.out.println("Name of employee "+name);
	}
	public void setAge(int employeeAge) {
		age=employeeAge;
	}
	public int getAge() {
		System.out.println("Employee age "+age);
		return age;
	}
	public void idNo(int id) {
		System.out.println("ID "+id);
	}
	public void salary(int sal) {
		System.out.println("Salary "+sal);
	}
	public static void main(String[] args) {
		Employee ne=new Employee("Ram");
		int id=101;
		ne.idNo(id);
		ne.setAge(25);
		ne.getAge();
		int sal=25000;
		ne.salary(sal);	
	}
}

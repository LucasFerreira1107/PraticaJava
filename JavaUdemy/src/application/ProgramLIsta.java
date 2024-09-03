package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramLIsta{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int numEmployee = sc.nextInt();
		
		for(int i=0; i < numEmployee; i++) {
			System.out.println();
			System.out.printf("Employee #%d%n", i +1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee temp = new Employee(id, name, salary);
			
			employee.add(temp);

		}
		
		System.out.print("Enter the employee id that will have their salary increased: ");
		int idPercentage = sc.nextInt();
		
//		for(Employee x: employee) {
//			if(x.getId() == idPercentage) {
//				System.out.print("Enter the percentage: ");
//				Double percentage = sc.nextDouble();
//				x.increaseSalary(percentage);
//			}
//		}
		
		Employee emp = employee.stream().filter(x -> x.getId() == idPercentage).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This is id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employee: ");
		for(Employee x: employee) {
			System.out.println(x.toString());
		}
		
		
		sc.close();
	}

}

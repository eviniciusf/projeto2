package application;
import java.util.Scanner;
import exercicio_employee.Employee;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter employee name: ");
		employee.name = sc.nextLine();
		System.out.print("Enter employee gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Enter tax: ");
		employee.tax = sc.nextDouble();
		
		double salary = employee.netSalary();
		
		System.out.println("Employee: "+ employee.name + ", $" + String.format("%.2f", salary));
		
		System.out.print("Wich percentage to increase salary? ");
		double percentagem = sc.nextDouble();
		employee.increaseSalary(percentagem);
		
		salary = employee.netSalary();
		
		System.out.println("Updated data: "+ employee.name + ", $" + String.format("%.2f", salary) );
		sc.close();
		
			
	}

}

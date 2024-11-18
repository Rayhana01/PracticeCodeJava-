package Demo;

import java.util.Scanner;

public class Employee {

    double baseSalary;
    double bonus;
    double deduction;
    
    public void calSalary() {
        double totalSal = baseSalary + bonus - deduction;
        System.out.printf("Total Salary: %.2f%n", totalSal);
    }
    
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount for base salary: ");
        baseSalary = scanner.nextDouble();
        
        System.out.print("Enter amount for Bonus: ");
        bonus = scanner.nextDouble();
        
        System.out.print("Enter amount for deduction: ");
        deduction = scanner.nextDouble();
        
        scanner.close();
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputDetails(); // Get user input
        emp.calSalary();    // Calculate and display total salary
    }
}


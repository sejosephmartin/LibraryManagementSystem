package LibraryManagementSystem;

import java.util.Scanner;

public class employeeManagement {
    public static void main(String[] args) {

        LibraryFunctions lib = new LibraryFunctions();

        Scanner sc = new Scanner(System.in);
        menu(); // menu or the options of the program
        boolean quit = false;

        while (!quit) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int employeeId = (int) (Math.random() * 9999); // 0 to 100
                    System.out.print("Your ID: " + employeeId);
                    System.out.print("\nEnter your name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter your position: ");
                    String position = sc.next();
                    System.out.print("Salary: ");
                    Double salary = sc.nextDouble();
                    System.out.println("**The employee was added with an id of " + employeeId + "**");
                    System.out.println("---------------------");
                    lib.addEmployee(employeeId, name, age, position, salary);
                    break;

                case 2:
                    lib.searchEmployee();
                    break;

                case 3:
                    lib.updateEmployee();
                    System.out.println("---------------------");
                    break;

                case 4:
                    lib.delEmployee();
                    break;

                case 5:
                    lib.displayEmployee();
                    break;

                case 6:
                    quit = true;
                    System.out.println("Thank you for using our program!!");
                    break;
            }

        }

    }

    // menu for the employeee

    private static void menu() {
        System.out.println("***Employee Management System***"
                + "\n Add Employee(1)"
                + "\n Search Employee(2)"
                + "\n Update Employee(3)"
                + "\n Delete Employee(4)"
                + "\n Display all Employee(5)"
                + "\n Exit(6)");
        System.out.println("---------------------");
    }
}

class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
    }

    double calculateSalary() {
        return salary;
    }
}


class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

  
    double calculateSalary() {
        return salary + bonus;
    }
}


class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

  
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Alice", 101, 50000, 5000);
        PartTimeEmployee p = new PartTimeEmployee("Bob", 102, 20, 500);

        System.out.println("Full Time Employee:");
        f.displayDetails();
        System.out.println("Total Salary: " + f.calculateSalary());

        System.out.println("\nPart Time Employee:");
        p.displayDetails();
        System.out.println("Total Salary: " + p.calculateSalary());
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

public class prg8 {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 75000, "Engineering"),
            new Employee("Bob", 55000, "HR"),
            new Employee("Charlie", 70000, "Engineering"),
            new Employee("David", 60000, "HR"),
            new Employee("Eve", 80000, "Marketing")
        );

        // 1. Map: Create a new list containing employee names and their corresponding salaries
        List<String> employeeNamesAndSalaries = employees.stream()
                .map(emp -> emp.getName() + ": $" + emp.getSalary())
                .collect(Collectors.toList());

        System.out.println("Employee Names and Salaries:");
        employeeNamesAndSalaries.forEach(System.out::println);

        // 2. Filter: Filter the employees who belong to a specific department (e.g., "Engineering")
        String departmentToFilter = "Engineering";
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equals(departmentToFilter))
                .collect(Collectors.toList());

        System.out.println("\nEmployees in the " + departmentToFilter + " Department:");
        filteredEmployees.forEach(emp -> System.out.println(emp.getName() + ": $" + emp.getSalary()));

        // 3. Reduce: Calculate the average salary for employees in each department
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, 
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("\nAverage Salary by Department:");
        averageSalaryByDepartment.forEach((dept, avgSalary) -> 
                System.out.println(dept + ": $" + avgSalary));
    }
}

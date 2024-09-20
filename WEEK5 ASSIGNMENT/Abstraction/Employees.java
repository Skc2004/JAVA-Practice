abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    abstract double calculateSalary();
    abstract String getEmployeeDetails();
}


class RegularEmployee extends Employee {
    double basicSalary;
    double bonus;


    public RegularEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }


    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    String getEmployeeDetails() {
        return "Regular Employee: " + name + ", ID: " + id + ", Salary: " + calculateSalary();
    }
}


class ContractEmployee extends Employee {
    double contractAmount;


    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }


    @Override
    double calculateSalary() {
        return contractAmount;
    }

    @Override
    String getEmployeeDetails() {
        return "Contract Employee: " + name + ", ID: " + id + ", Contract Amount: " + calculateSalary();
    }
}


class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;


    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    String getEmployeeDetails() {
        return "Hourly Employee: " + name + ", ID: " + id + ", Hours Worked: " + hoursWorked + ", Salary: " + calculateSalary();
    }
}


public class Employees {
    public static void main(String[] args) {
        Employee regEmp = new RegularEmployee("John Mark", 101, 50000, 5000);
        Employee contEmp = new ContractEmployee("Jane Smith", 102, 60000);
        Employee hourEmp = new HourlyEmployee("Mark Johnson", 103, 50, 160);

        System.out.println(regEmp.getEmployeeDetails());
        System.out.println(contEmp.getEmployeeDetails());
        System.out.println(hourEmp.getEmployeeDetails());
    }
}

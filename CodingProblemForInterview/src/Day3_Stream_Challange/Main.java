package Day3_Stream_Challange;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Add Employees
        employeeList.add(new Employee(101, "Amit", 50000));
        employeeList.add(new Employee(102, "Bablu", 75000));
        employeeList.add(new Employee(103, "Chetan", 65000));
        employeeList.add(new Employee(104, "Dinesh", 75000));

        // Find highest salary
//        OptionalDouble maxSalary = employeeList.stream()
//            .mapToDouble(Employee::getSalary)
//            .max();
        
        
//        OptionalDouble max = employeeList.stream().mapToDouble(Employee::getSalary).max();
        
        
//        System.out.println(max);
        
         List<Employee> list = employeeList.stream().distinct().sorted().toList();
        
         System.out.println(list);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//
//        List<Employee> highestPaid = employeeList.stream()
//            .filter(e -> maxSalary.isPresent() && e.getSalary() == maxSalary.getAsDouble())
//            .toList();
//
//        // Display highest paid employee(s)
//        highestPaid.forEach(System.out::println);
    }
}

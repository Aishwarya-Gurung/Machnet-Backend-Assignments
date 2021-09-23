package Question5;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Employees {
    String name;
    int age;
    String gender;
    String department;
    int salary;

    public Employees(String name, int age, String gender, String department, int salary){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.department=department;
        this.salary=salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public Integer getSalary() {
        return this.salary;
    }

        public static Integer averageSalaryEmployees(List<Integer> salary){
        int totalSalary = salary.stream().reduce(0, (acc, e) -> acc + e);
        return  totalSalary/salary.size();
    }

    public static void main(String[] args) {
        List<Employees> employeeList = new ArrayList<Employees>();
        //Adding Employees
        employeeList.add(new Employees("Bean", 40, "male", "Sales", 100000));
        employeeList.add(new Employees("kiara", 39, "female", "Sales", 90000));
        employeeList.add(new Employees("Prayag", 37, "male", "Sales", 70000));
        employeeList.add(new Employees("Shreya", 32, "female", "Marketing", 80000));
        employeeList.add(new Employees("Savannah", 30, "female", "Marketing", 70000));
        employeeList.add(new Employees("Golu", 29, "male", "Accounts", 50000));
        employeeList.add(new Employees("Tina", 25, "female", "Accounts", 40000));

        //Average salary of employees
        List<Integer> salaries = employeeList.stream()
                .map(e->e.salary)
                .collect(Collectors.toList());
        System.out.println("Average salary of employees is  "+ averageSalaryEmployees(salaries));

        //Unique departments
        Set<String> department = employeeList.stream()
                .map(e->e.department)
                .collect(Collectors.toSet());
        System.out.println("Unique Department names are: "+department);

        //Average salaries based on department
        Map<String, Double> departments = employeeList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingInt(Employees::getSalary)));

        System.out.println(departments);
    }

}

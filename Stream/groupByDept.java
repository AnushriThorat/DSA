import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class groupByDept {
    public static void main(String[] args){
        List<Employee> emp= List.of(
                new Employee(1,"Ana","hr"),
                new Employee(2, "Rahul", "HR"),
                new Employee(3, "Priya", "IT"),
                new Employee(4, "Sneha", "HR"),
                new Employee(5, "Raj", "Finance")
        );

        Map<String,List<Employee>> map=emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(map);
    }
}

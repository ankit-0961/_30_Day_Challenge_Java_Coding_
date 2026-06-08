package Day_7_Challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question_4_ {

	public static void main(String[] args) {
		List<Employee> employee=Arrays.asList(
				 new Employee("Ankit", 50000),
	                new Employee("Rahul", 80000),
	                new Employee("Amit", 70000),
	                new Employee("Vijay", 90000),
	                new Employee("Karan", 60000)
	                
	                
	              
	        );
		  List<Employee> top3 =employee.stream()
				  .sorted(Comparator.comparing(Employee::getSalary).reversed())
				  .limit(3)
				  .collect(Collectors.toList());
		  
		  top3.forEach(System.out::println);
	}

}

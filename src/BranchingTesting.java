import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BranchingTesting {

	public static void main(String[] args) {
		
		Set<Employee> set=new TreeSet<>();
		
		Employee e1=new Employee(1, "Test", "NJ", 2345);
		Employee e2=new Employee(2, "John", "NYC", 2345);
		Employee e3=new Employee(3, "Alice", "LA", 2345);
		Employee e4=new Employee(4, "Sam", "NJ", 2345);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		set.forEach(emp->System.out.println(emp));
		
//		for(Employee e:set)
//		{
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());
//		}
		
		
		
		
		
		
		
	}
}

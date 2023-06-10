package abc.raminterview.preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeApp {
	 
	public static List<Employee>empList=new ArrayList<Employee>();
	public static void main(String[] args) {
		empList.add(new Employee(1, "ABC", 25, "Male", 24510.56, "java",2018));
		empList.add(new Employee(2, "DEF", 24, "Female", 18756.15, "C++",2018));
		empList.add(new Employee(3, "GHI", 27, "Male", 36982.78, "python",2019));
		empList.add(new Employee(4, "IJK", 30, "Male", 27255.63, "C++",2013));
		empList.add(new Employee(5, "KLM", 33, "Female", 21510.14, "python",2022));
		empList.add(new Employee(6, "MNO", 24, "Male", 23565.75, "java",2014));
		empList.add(new Employee(7, "PQR", 21, "Male", 74545.12, "data cloud",2015));
		empList.add(new Employee(8, "STU", 18, "Female", 35462.15, "mern-stack",2020));
		empList.add(new Employee(9, "VWX", 36, "Male", 55015.78, "sales-force",2020));
		empList.add(new Employee(1, "YZA", 42, "Female", 13543.00, "aws",2020));
		empList.add(new Employee(2, "BCA", 40, "Male", 14542.87, "sales-force",2020));
		
	}
	// query 1 :- How many male and female Employess in the organization?
//		numberOfEmp();

		//Print the name of all department in the organization ?
	 //    allDepartment();
	//what is the avarage age of male and female Employees?
	 //    avgAgeOfEmp();

		//get the details of higest paid employee in the organization?
	  //    higestSalary();

		//get the names of all Employee who have joined after 2015?
//	        joinDate();
	  
	 // empInDepartment();
	  
	   //  avragSalEachDepart();
		
//		youngestEmpInTheDep();
		
//		mostExperianceInTheOrganization();
		
//		avgSalMaleAndFemale();
	 //  empAllDepartment(); 

		// query 1 :- How many male and female Employess in the organization?
		public static void numberOfEmp() {
			Map<String, Long>noOfMaleAndFemaleMap=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			System.out.println(noOfMaleAndFemaleMap);
			}
		//Print the name of all department in the organization ?
		public static void allDepartment() {
			empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		}
		
		//what is the avarage age of male and female Employees?
		public static void avgAgeOfEmp() {
			Map<String, Double>avarageAge=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			System.out.println(avarageAge);
		}
		
		//get the details of higest paid employee in the organization?
		public static void higestSalary() {
			Optional<Employee>higestPaidSal=empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			System.out.println(higestPaidSal);
		}
		
		//get the names of all Employee who have joined after 2015?
		
		public static void joinDate() {
			empList.stream().filter(e->e.getDoj()>2015).map(Employee::getName).forEach(System.out::println);
		}
		//Count the no of employee in each Department ?
		
		public static void empInDepartment() {
			Map<String, Long>empCountByDepartment=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			
			Set<Entry<String ,Long>>entryset=empCountByDepartment.entrySet();
			
			for(Entry<String, Long>entry:entryset) {
				System.out.println(entry.getKey() + " :"+ entry.getValue());
			}
			
		}
		
		// query 7 whaty is the avarage salary of each department ?
		
		public static void avragSalEachDepart() {
			Map<String , Double>avgSalOfDepartment=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	    Set<Entry<String, Double>>entryset=avgSalOfDepartment.entrySet();
			for(Entry<String, Double> entry:entryset) {
				System.out.println(entry.getKey() + " :"+ entry.getValue());
			}
		}
		
		//query 8 Get the details of youngest male employee in the product ?
		public static void youngestEmpInTheDep() {
			Optional<Employee>youngestEmpOfDep=empList.stream().filter(e->e.getGender()=="female" && e.getDepartment()=="actress")
					.min(Comparator.comparingInt(Employee::getAge));
			
			Employee youngestEmp=youngestEmpOfDep.get();
			
			System.out.println("Id :" +youngestEmp.getId());
			System.out.println("Name :" + youngestEmp.getName());
			
		}
		
		// Query 9 who was the most working experiance in the organization ?
		
		public static void mostExperianceInTheOrganization(){
			
		Optional<Employee>mostexperiacce=empList.stream().sorted(Comparator.comparingInt(Employee::getDoj)).findFirst();
		Employee seniorEmployee=mostexperiacce.get();
		
		System.out.println("Id :" +seniorEmployee.getId());
		System.out.println("Name :"+ seniorEmployee.getName());
			
			}
		
		//Query 10 what is the avg salary male and female employee?
		
		public static void avgSalMaleAndFemale() {
			
			Map<String, Double>avgSalMaleAndFemale=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
			
			System.out.println(avgSalMaleAndFemale);
			
		}
		
		//query 11 list down the all employee in each department ?
		
		public static void empAllDepartment() {
			
			Map<String, List<Employee>> allDeprtEmployees=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	  Set<Entry<String,List<Employee>>>entryset=allDeprtEmployees.entrySet();

	  for(Entry<String, List<Employee>>entry:entryset) {
		  
		  System.out.println("------------------------------");
		  
		  System.out.println("Employess In : " + entry.getKey());
		  
		  System.out.println("------------------------------");
		  
		  List<Employee>list=entry.getValue();
		  System.out.println(list);
		  
	  }
	  
		}

}

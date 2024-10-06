package main.com.Personal_project_folder.API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static void main(String[] args){
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Kiwi");

        System.out.println(fruits);

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("List in ascending order");
        System.out.println(sortedList);
        System.out.println();

        //A different way of doing the same thing as above with the use of the lambda expression
        System.out.println("Different way of printing the list in an ascending order");
        List<String> sortedList1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sortedList1.forEach( (l) ->{
            System.out.println(l);
        });

        //The way that the instructor used it
        System.out.println();
        System.out.println("Different way of printing the list in an ascending order");
        List<String> sortedList2 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList2);

        System.out.println();
        System.out.println("Different way of printing the list in an ascending order");
        List<String> sortedList3=fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList3);

        //Now to do write the whole thing in a descending order
        System.out.println();
        System.out.println("List in descending order");
        List<String> ReverseSortedList = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ReverseSortedList);

        //Different code that does the same as the code above
        System.out.println();
        System.out.println("Different way of making the list be printed in descending order");
        List<String> ReverseSortedList2 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(ReverseSortedList2);

        //sort employees by salary in ascending order
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Santosh",29,350000));
        employees.add(new Employee(30,"Sanjay",30,450000));
        employees.add(new Employee(40,"Pramond",29,500000));
        List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        employeesSortedList.forEach(s-> System.out.println(s));
        System.out.println();
        System.out.println(employeesSortedList);
        System.out.println();
        //Do the same exact thing as above but with a lambda expression
        System.out.println("The same thing as above but with the lambda Expression");
        List<Employee> employeesSortedListLambda = employees.stream()
                .sorted(((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()))).collect(Collectors.toList());
        System.out.println(employeesSortedListLambda);
        System.out.println();
        //To do it in a descending order
        System.out.println("Employee salaries in a descending order");
        List<Employee> employeesSortedListLambdaDescendingOrder=employees.stream()
                        .sorted(((o1, o2) -> (int)(o2.getSalary() - o1.getSalary()))).collect(Collectors.toList());
        System.out.println(employeesSortedListLambdaDescendingOrder);
        System.out.println();
        //additional way to compare and print the values in ascending order
        System.out.println("values in ascending order");
        List<Employee>EmployeeSortedList1 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());//ascending order
        System.out.println(EmployeeSortedList1);
        System.out.println("Reversed");
        List<Employee>EmployeeSortedList2 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)
                .reversed()).collect(Collectors.toList());//descending order
        System.out.println(EmployeeSortedList2);

        //sort employees by their age
        System.out.println("Employees sorted by their age in an ascending order");
        List<Employee>SortedByAgeList = employees.stream().sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(SortedByAgeList);
        System.out.println("Employees sorted by their age in a descending order");
        List<Employee>SortedByAgeListInDescendingOrder = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println(SortedByAgeListInDescendingOrder);

        System.out.println();
        //List the employees in ascending order with their names
        List<Employee>AscendingWithTheNames = employees.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(AscendingWithTheNames);
        System.out.println();
        //List the names of the employees in a descending order
        List<Employee>DescendingWithTheNames = employees.stream().sorted(Comparator.comparing(Employee::getName)
                .reversed()).collect(Collectors.toList());
        System.out.println(DescendingWithTheNames);


    }
}

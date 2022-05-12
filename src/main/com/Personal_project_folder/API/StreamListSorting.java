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
        System.out.println(employeesSortedList);
    }
}

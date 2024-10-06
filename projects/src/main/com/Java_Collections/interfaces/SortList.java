package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    
    public static void main(String[] args) {
        
        //create list
        List<Integer> intList = new ArrayList<Integer>();
        
        intList.add(5);
        intList.add(3);
        intList.add(23);
        intList.add(15);
        intList.add(40);
        intList.add(32);
        
        Collections.sort(intList);
        System.out.println(intList);

        Collections.reverse(intList);
        System.out.println(intList);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Rajesh", 22, 50000));
        employees.add(new Employee(2, "Billy", 30, 65000));
        employees.add(new Employee(3, "Kyle", 25, 55000));
        employees.add(new Employee(4, "Donny", 21, 45000));
        
        // Collections.sort(employees, new MySort());//ascending
        // System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());//to get in descending order
                }
            });

            Collections.sort(employees, (o1,o2)->(int)(o1.getSalary() - o2.getSalary())); //ascending order
            System.out.println(employees);

            //to get employee names in descending order
            Collections.sort(employees,(o1, o2) ->(o2.getName().compareTo(o1.getName()))); // to do them in ascending order, just switch o2 and o1 positions
            System.out.println(employees); //in descending order using names
        }
    }

// class MySort implements Comparator<Employee>{
//     @Override
//     public int compare(Employee o1, Employee o2) {
//         return (int) (o1.getSalary() - o2.getSalary());
//     }
    
// }
import employee.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Employee employee = // adresa: 123 new Employee(); // adresa: 123
//        employee.setName("Ion");
//
//        System.out.println(employee);
//
//        Employee employee1 =  // adresa: 123   new Employee(); // adresa: 345
//        employee1.setName("Ion");
//
//        boolean a = employee == employee1;  // false
//
//        employee1 = employee; // ambele au adresa 345
//
//        boolean b = employee == employee1; // true   345 == 345
//
//        int x = 2;  //  nu se pastreaza adresa
//        int y = 2;  //
//
//        boolean z = y == x; // true



//        String nume = new String("Ion");   // ADRRESA LA OBIECT: 789
//
//        String prenume = new String("Popescu");  // ADRRESA LA OBIECT: 654
//
//      //  nume == prenume  =>  789 == 654  => false
//
//        prenume = nume; // prenume = 789
//
//        System.out.println(nume); // 1. Se duce pe adresa 789
//                                  // 2. Ia obiectul de pe adresa 789 si il afiseaza
//
//        System.out.println(prenume); // 1. Se duce pe adresa 789
//                                     // 2. Ia obiectul de pe adresa 789 si il afiseaza
//
//        boolean a = 2 == 2;
//

        Integer x = new Integer(2);  // adresa: 543
        Integer y = x; // adresa: 543


        // x.equals(y) ==> x == y


        boolean c = x == y; // verificam adresa de memorie


//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Vasile"));
//        employees.add(new Employee("Ion"));
//        employees.add(new Employee("Vasile"));
//
//
//
//
//
//        Employee e = employees.get(0); // 345

//        for (Employee employee : employees) {
//            if(employee == e) {
//                System.out.println(employee);
//            }
//        }

        Employee employee = new Employee("Ion", 23); // adresa: 567
//        Employee employee1 = new Employee("Ion", 23); // adresa: 895
//
        System.out.println(employee); // true



        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee("Vlad", 34));  // 1. Calculam grupul
                                                              // 2. Daca deja exista asa obiect
        employeeSet.add(new Employee("Vasile", 25));                                                // 3. Daca nu exista il adaugam
        Employee e = new Employee("Ion", 34);
        employeeSet.add(e);



        employeeSet.add(new Employee("Gheorghe", 34)); // adresa: 345

        employeeSet.add(new Employee("Gheorghe", 34)); // adresa: 678

        // 36   -- > 3 +

        // 3333
        // 4444
        // 5555

        // 3 +  -->  3


        ArrayList<Employee> list = new ArrayList<>();




        Set<Integer> integers = new TreeSet<>();

        integers.add(new Integer(2));
        integers.add(new Integer(1));

        // 1, 2


        // 1. HashSet -> Pastreaza ordinea, are elemente unice
        // 1. TreeSet -> Nu Pastreaza ordinea, are elemente unice, sortate

    }
}
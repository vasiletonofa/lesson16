package employee;

import java.util.Objects;

public class Employee extends Object {
    String name; // null
    int age; // 0

    int salariu;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nume: " +  name + " , Varsta: " + age ;
    }

    @Override
    public boolean equals(Object obj) {     // 1. Override la equals    2. Verificam daca variabilile sunt egale
        if(this == obj) {
            return true;
        }

        Employee x = (Employee) obj;

        if (this.name.equals(x.name) && this.age == x.age) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return salariu;  // 34
    }
}

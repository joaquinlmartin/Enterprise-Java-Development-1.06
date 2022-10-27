package main;
import classes.Employee;
import classes.Intern;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {

        Employee employee1 = new Employee("Juan","Lawyer",20000, "Alicante" );
        Employee employee2 = new Employee("Cristina","Administrative",30000, "Madrid" );
        Employee employee3 = new Employee("Celina","IT Developement",20000, "Tibi" );
        Employee employee4 = new Employee("Pablo","Full Stack",22000, "Madrid" );
        Employee employee5 = new Employee("Helena","Front-end",20000, "Huelva" );
        Employee employee6 = new Employee("Miguel","Psicology",19000, "Sagunto" );
        Intern intern7 = new Intern(20000,"Ines","Advertising", 23000, "Vitoria" );
        Employee employee8 = new Employee("Sebas","Medical",23000, "Barcelona" );
        Employee employee9 = new Employee("Ester","Marketing",45000, "Alicante" );
        Intern intern10 = new Intern(20000,"Dani","Advertising", 18000, "Madrid" );

        FileWriter filewriter = new FileWriter("employees.txt", true);
        filewriter.write( "Employee " + employee1.getName() + " works in the " + employee1.getDepartment() + " department. The salary of this position in "+ employee1.getLocation() + " is "+ employee1.getSalary() + " euros.\n Employee"
                + employee2.getName() + " works in the " + employee2.getDepartment() + " department. The salary of this position in "+ employee2.getLocation() + " is "+ employee2.getSalary() + " euros.\n Employee "
                + employee3.getName() + " works in the " + employee3.getDepartment() + " department. The salary of this position in "+ employee3.getLocation() + " is "+ employee3.getSalary() + " euros.\n Employee"
                + employee4.getName() + " works in the " + employee4.getDepartment() + " department. The salary of this position in "+ employee4.getLocation() + " is "+ employee4.getSalary() + " euros.\n Employee"
                + employee5.getName() + " works in the " + employee5.getDepartment() + " department. The salary of this position in "+ employee5.getLocation() + " is "+ employee5.getSalary() + " euros.\n Employee"
                + employee6.getName() + " works in the " + employee6.getDepartment() + " department. The salary of this position in "+ employee6.getLocation() + " is "+ employee6.getSalary() + " euros.\n Employee"
                + intern7.getName() + " works in the " + intern7.getDepartment() + " department. The salary of this position in "+ intern7.getLocation() + " is "+intern7.getMaxSalary() + " euros.\n Employee"
                + employee8.getName() + " works in the " + employee8.getDepartment() + " department. The salary of this position in "+ employee8.getLocation() + " is "+ employee8.getSalary() + " euros.\n Employee"
                + employee9.getName() + " works in the " + employee9.getDepartment() + " department. The salary of this position in "+ employee9.getLocation() + " is "+ employee9.getSalary() + " euros.\n Employee"
                + intern10.getName() + " works in the " + intern10.getDepartment() + " department. The salary of this position in "+ intern10.getLocation() + " is "+ intern10.getMaxSalary() + " euros." );

        filewriter.close();

    }

}
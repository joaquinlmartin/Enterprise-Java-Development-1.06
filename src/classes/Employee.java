package classes;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private String location;

    public Employee(String name, String department, int salary, String location){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.location = location;
    }

    //SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setLocation(String location){
        this.location = location;
    }


    //GETTERS
    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getLocation(){
        return this.location;
    }
}
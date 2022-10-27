package classes;

public class Intern extends Employee {
    private int maxSalary;

    public Intern(int maxSalary, String name, String department, int salary, String location) {
        super(name, department, salary, location);
        setMaxSalary(maxSalary);
    }

    //SETTERS
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = 20000;
    }

    //GETTERS
    public int getMaxSalary() {

        if (this.getSalary() > 20000) {
            return maxSalary;
        } else {
            return getSalary();
        }
    }
}

package AdvancedJava.PersonStudentStaff;

public class Lecturer extends Person{

        private Specialization specialization;
        private double salary;

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Lecturer(Specialization specialization, double salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer(String name, String address, Specialization specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s, %s", name,address,specialization.toString().toLowerCase(),salary);
    }

}

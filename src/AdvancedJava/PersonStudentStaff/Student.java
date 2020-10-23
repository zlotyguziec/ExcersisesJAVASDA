package AdvancedJava.PersonStudentStaff;

public class Student extends Person{
    private StudiesType studiesType;
    private int studiesYear;
    private double studiesPrice;

    public Student(String name, String address, StudiesType studiesType, int studiesYear, double studiesPrice) {
        super(name, address);
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesPrice = studiesPrice;
    }

    public StudiesType getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(StudiesType studiesType) {
        this.studiesType = studiesType;
    }

    public int getStudiesYear() {
        return studiesYear;
    }

    public void setStudiesYear(int studiesYear) {
        this.studiesYear = studiesYear;
    }

    public double getStudiesPrice() {
        return studiesPrice;
    }

    public void setStudiesPrice(double studiesPrice) {
        this.studiesPrice = studiesPrice;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s, %s, %s", name,address,studiesType.toString().toLowerCase(),studiesYear,studiesPrice);
    }
}

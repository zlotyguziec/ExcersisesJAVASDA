package AdvancedJava.PersonStudentStaff;

public class Person {

    protected String name;
    protected String address;

    public Person() {
        name = null;
        address = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s->%s", name,address);
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

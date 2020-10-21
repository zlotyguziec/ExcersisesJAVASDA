package MrAndMs;

import java.time.LocalDate;
import java.time.Period;

class Person {
    private String name;
    private String secondName;
    private String surname;
    private String streetNr;
    private String flatNr;
    private String city;
    private String userInputDate;
    private LocalDate dateOfBirth;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getFlatNr() {
        return flatNr;
    }

    public void setFlatNr(String flatNr) {
        this.flatNr = flatNr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   // public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getUserInputDate() { return userInputDate; }

    public void setUserInputDate(String userInputDate) { this.userInputDate = userInputDate; }


    public Person(String name, String secondName, String surname, String streetNr, String flatNr, String city, String userInputDate) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.streetNr = streetNr;
        this.flatNr = flatNr;
        this.city = city;
        this.userInputDate = userInputDate;
    }



        public int getAge() {
            LocalDate dateOfBirth = LocalDate.parse(getUserInputDate());
                return Period.between(dateOfBirth, LocalDate.now()).getYears();
            }

            public boolean isFemale(){
                return getName().charAt(getName().length()-1)=='a';
            }

    }

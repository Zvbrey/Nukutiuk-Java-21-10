package com.hillel.nukutiuk.homeworks.homework14;

public class Registration {
    private String name, email, lastName;
    private int day, month, year, number, weight, pressure, numberOfSteps;
    private int age = 2020;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setPressure(int newPressure) {
        this.pressure = newPressure;
    }

    public void setNumberOfSteps(int newNumberOfSteps) {
        this.numberOfSteps = newNumberOfSteps;
    }

    public Registration(String name, String email, int day, int month, int year, int number, int weight, int pressure
            , int numberOfSteps, String lastName) {
        this.name = name;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.number = number;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
        this.lastName = lastName;
        age -= year;
    }

    public String accountInfo() {
        return "Name " + name + "\n" + "Email " + email + "\n" + "Day " + day + "\n" + "Month " + month + "\n" + "Year "
                + year + "\n" + "Number " + number + "\n" + "Weight " + weight + "\n" + "Pressure " + pressure + "\n"
                + "Number of steps " + numberOfSteps + "\n" + "Last name " + lastName + "\n" + "Age " + age + "\n";
    }

}

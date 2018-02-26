package CS;

import Enums.Gender;

public class Customer {
    private String name;
    private String surname;
    private double feetSize;
    private double moneyAmount;
    private Gender gender;

    public Customer(String name, String surname, double feetSize, double moneyAmount, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.feetSize = feetSize;
        this.moneyAmount = moneyAmount;
        this.gender = gender;
    }

    public void buyShoes(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(double feetSize) {
        this.feetSize = feetSize;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

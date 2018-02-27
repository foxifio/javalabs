package customer;

import enums.Gender;
import enums.Size;

public class Customer {
    private String name;
    private String surname;
    private Gender gender;
    private Size size;
    private double moneyAmount;

    public Customer(String name, String surname, Gender gender, Size size, double moneyAmount) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.size = size;
        this.moneyAmount = moneyAmount;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}

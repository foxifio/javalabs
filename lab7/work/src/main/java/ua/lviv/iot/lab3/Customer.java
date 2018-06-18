package ua.lviv.iot.lab3;

public class Customer {
    private String name;
    private String surname;
    private Gender gender;
    private Size size;
    private double moneyAmount;

    public Customer(final String name, final String surname, final Gender gender, final Size size, final double moneyAmount) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.size = size;
        this.moneyAmount = moneyAmount;
    }

}

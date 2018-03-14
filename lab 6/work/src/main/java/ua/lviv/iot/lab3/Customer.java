package ua.lviv.iot.lab3;

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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}

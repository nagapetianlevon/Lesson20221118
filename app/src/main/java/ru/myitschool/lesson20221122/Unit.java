package ru.myitschool.lesson20221122;

public abstract class Unit {
    private String name;
    private String phone;
    public static int ID;

    public abstract String Speak();

    {
        name = "Test";
        phone = "1234567890";
    }

    public Unit(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Unit() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

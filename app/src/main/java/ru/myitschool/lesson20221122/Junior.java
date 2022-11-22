package ru.myitschool.lesson20221122;

public class Junior extends Unit{
    @Override
    public String Speak() {
        return "Junior";
    }

    public Junior(String name, String phone) {
        super(name, phone);
    }

    public Junior() {
    }
}

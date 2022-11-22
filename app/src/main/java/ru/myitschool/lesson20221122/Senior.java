package ru.myitschool.lesson20221122;

public class Senior extends Unit{
    @Override
    public String Speak() {
        return "Senior";
    }

    public Senior(String name, String phone) {
        super(name, phone);
    }

    public Senior() {
    }
}

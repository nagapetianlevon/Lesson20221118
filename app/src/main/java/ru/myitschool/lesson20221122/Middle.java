package ru.myitschool.lesson20221122;

public class Middle extends Unit{

    @Override
    public String Speak() {
        return "Middle";
    }

    public Middle(String name, String phone) {
        super(name, phone);
    }

    public Middle() {
    }
}

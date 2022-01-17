package com.company;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this(number, model); //Вызов из конструктора с тремя параметрами конструктор с двумя.
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void receiveCall(Person person){
        System.out.println(person.getFullName() + " is calling...");
    }
    public void receiveCall(Person person, Phone phone){
        System.out.println(person.getFullName() + " " + phone.number + " " + "is calling...");
    }
    public void sendMessage(String number){
        System.out.println("Send message to: " + number);
    }
}

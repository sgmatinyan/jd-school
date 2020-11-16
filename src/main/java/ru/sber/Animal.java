package ru.sber;

public class Animal {
    private String name;
    private int age;
    private int weight;

    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat() {
        weight++;
    }

    public void swim() {
        if (weight > 2) {
            weight -= 2;
        }
    }

    public void run() {
        if (weight > 1) {
            weight--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

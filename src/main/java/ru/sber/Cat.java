package ru.sber;

public class Cat extends Animal {
    private final int MAX_WEIGHT = 12;
    private boolean depressed;


    public Cat(String name, int age) {
        super(name, age);
        setWeight(7);
        depressed = false;
    }

    @Override
    public void swim() {
        depressed = true;
    }

    @Override
    public void eat() {
        super.eat();
        depressed = false;
        while(getWeight() > MAX_WEIGHT) {
            climb();
            run();
        }
    }

    public String makeSound(){
        return "meow";
    }

    public void climb() {
        if(getWeight() > 1) {
            setWeight(getWeight() - 1);
        }
    }

    public boolean isDepressed() {
        return depressed;
    }
}

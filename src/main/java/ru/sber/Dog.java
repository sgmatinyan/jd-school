package ru.sber;

public class Dog extends Animal {
    private final int MAX_WEIGHT = 15;

    public Dog(String name, int age) {
        super(name, age);
        setWeight(10);
    }

    @Override
    public void eat() {
        super.eat();
        while(getWeight() > MAX_WEIGHT){
            swim();
            run();
        }
    }

    public String makeSound(){
        return "arf-arf";
    }
}

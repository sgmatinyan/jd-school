package ru.sber;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat = new Cat("Tom", 5);

    @org.junit.jupiter.api.Test
    void catIsHappyAfterEat() {
        cat.swim();
        cat.eat();
        assertFalse(cat.isDepressed());
    }
}
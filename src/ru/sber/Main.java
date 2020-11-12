package ru.sber;

public class Main {
    // 3. Создать в этом проекте класс с методом main аналогичный тому который мы с вами создавали.
    public static void main(String[] args) {

    }

    // 4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    public static byte sumByteAndShort(byte a, short b) {
        return (byte)(a + b);
    }

    // 5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
    public static int multipleIntAndLong(int a, long b) {
        return (int)(a * b);
    }

    // 6. Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    // 7. Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isCharA(char ch) {
        return ch == 'A';
    }

    // 8. Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
    public static boolean isCharNumber(char ch) {
        return ch > 47 && ch < 58;
    }

    // 9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
    public static void printBinaryNumbers() {
        for (int i = 0; i < 31; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    // 10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядит в памяти
    public static void printBinaryNumbers2() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    // 11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    public static int getCharAsInt(char ch) {
        return ch;
    }

    // 12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
    public static char getIntAsChar(int num) {
        return (char)num;
    }

}

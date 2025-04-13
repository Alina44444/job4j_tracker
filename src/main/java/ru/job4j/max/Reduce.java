package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        /**
         * Ошибка в данном задании возникла из за того, что
         * локальная переменная int[] array в параметре метода to
         * затеняет переменную экземпляра класса private int[] array;
         * то есть имеет одинаковый идентификатор. Для того, чтобы код
         * работал корректно, надо использовать ключевое слово this,
         * чтобы явно указать java какую переменную надо использовать.
         */
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
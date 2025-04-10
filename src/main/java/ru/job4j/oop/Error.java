package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println(this.active + " " + this.status + " " + this.message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        errorOne.print();
        Error errorTwo = new Error(false, 2, "ErrorTwo");
        errorTwo.print();
        Error errorThree = new Error(true, 6, "ErrorSix");
        errorThree.print();
    }
}

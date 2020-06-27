package sda.calculator;

public class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public boolean isTeenager() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isChild() {
        if (age <= 12 && age >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdult() {
        if (age >= 20 && age <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGhost() {
        if (!isChild()
                && !isTeenager()
                && !isAdult()) {
            return true;
        }else {
            return false;
        }
    }
}

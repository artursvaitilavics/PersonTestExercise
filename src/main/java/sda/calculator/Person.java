package sda.calculator;

public class Person {
    int age;

    public Person(int age){
        this.age = age;
    }
    public boolean isTeenager(){
        if(age > 12 && age < 20){
            return true;
        }else {
            return false;
        }
    }
}

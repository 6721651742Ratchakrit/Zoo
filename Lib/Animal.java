package Lib;

public abstract class Animal {
    public static final char[] swim = null;
    private final String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String makeSound();
}

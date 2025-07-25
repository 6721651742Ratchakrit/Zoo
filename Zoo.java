import java.util.*;
import Lib.*;

public class Zoo {
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion "));
        animals.add(new Eagle("Eagle "));
        animals.add(new Penguin("Penguin "));
        animals.add(new Dolphin("Dolphin "));
        for (Animal animal : animals) {
            System.out.print(animal.getName());
            System.out.println(animal.makeSound());
        }
        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                Flyable animalfly = (Flyable) animal;
                System.out.println(animalfly.fly());

            } else if (animal instanceof Swimable){
                Swimable animalswim = (Swimable) animal;
                System.out.println(animalswim.swim());
            } else {
                System.out.println("This " + animal.getName() + "just walk in the Zoo");
            }
        }
    }
}

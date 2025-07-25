package Lib;

public class Dolphin extends Mammal implements Swimable {

    public Dolphin(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public String makeSound(){
        return "Clicking sounds";
    }
    
    public String swim() {
        return "The dolphin playfully swims in the sea.";
    }
    
}

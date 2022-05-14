package ss7_AbstractClass.Practice.Animal;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Chip chip";
    }

    @Override
    public String howtoEat() {
        return "cound be fried";
    }
}

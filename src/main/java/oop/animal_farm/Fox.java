package oop.animal_farm;

public class Fox extends Animal implements Canine{

    public Fox() {
        super(4);
    }

    @Override
    public String eat() {
        return "anything, yum";
    }

    @Override
    public String sound() {
        return "Some kind of alien noise";
    }

    public static void main(String[] args) {
        Animal bill = new Fox();
        System.out.println(bill.eat());
    }

    @Override
    public String hunt() {
        return "root through bushes";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}

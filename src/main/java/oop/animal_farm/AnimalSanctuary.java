package oop.animal_farm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AnimalSanctuary {
    private Dog bernie = new Dog();
    private Dog bernice = new Dog();
    private Fox bill = new Fox();
    private Fox lisa = new Fox();
    private List<Animal> animalsInTheSanctuary = new ArrayList<>();
    private List<Fox> foxesInTheSanctuary = new ArrayList<>();
    private List<Canine> canine = new ArrayList<>();
    public AnimalSanctuary() {
        foxesInTheSanctuary.add(this.bill);
        foxesInTheSanctuary.add(this.lisa);

        animalsInTheSanctuary.add(bill);
        animalsInTheSanctuary.add(bernie);

        canine.add(bernie);
        canine.add(bill);

        bill.wagTail();

    }




}

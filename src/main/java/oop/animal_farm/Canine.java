package oop.animal_farm;

import java.util.Collection;

public interface Canine {
    int legs = 4;
    String diet = "Carnivore";

    String hunt();
    String run(String speed);
    String tricks(String trick);

    default String wagTail(){
        return "wagTail";
    }

}

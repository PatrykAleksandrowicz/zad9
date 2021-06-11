package devices;

import creatures.FarmAnimal;
import creatures.Pet;

public class main {
    public static void  main(String[] args){
        Pet pet = new Pet("dog",12);
        FarmAnimal fa = new FarmAnimal("cow", 15);

        System.out.println(pet.getWeight());
        pet.feed();
        pet.feed(18.9);

        System.out.println(fa.getWeight());

    }
}
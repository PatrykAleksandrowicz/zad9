package creatures;

public class FarmAnimal extends Animal implements Edbile {
    private int count_animal;
    public FarmAnimal(String species, int count_animal) {
        super(species);
        this.count_animal = count_animal;
    }
    public void beEaten(){
        // nie jest napisane i nie rozumiem co ta metoda ma robic wiec zostawie pusta
    }
}

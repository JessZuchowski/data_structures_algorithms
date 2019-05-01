package challenges.fifoAnimalSHelter;

public class Animal {
    public String pet;
    public Animal next;

    public Animal(String pet) {
        this.pet = pet;
        this.next = null;
    }
}

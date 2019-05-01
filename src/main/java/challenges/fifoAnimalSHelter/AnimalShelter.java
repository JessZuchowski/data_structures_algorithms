package challenges.fifoAnimalSHelter;

public class AnimalShelter {
    public Animal front;
    public Animal rear;
    public Animal temp;

    public AnimalShelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String pet) {
        Animal newAnimal = new Animal(pet);
        if(this.rear == null) {
            this.rear = newAnimal;
            newAnimal.next = null;
        } else{
            newAnimal.next = this.rear;
            this.rear = newAnimal;
        }
    }
    public Animal dequeue() {
        if (front == null) {
            Animal temp = null;
            front = front.next;
            temp.next = null;
        }
        return temp;
    }
}

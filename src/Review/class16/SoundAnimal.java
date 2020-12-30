package Review.class16;

public abstract class SoundAnimal {

    public abstract void animalsound();
    public void sleep(){
        System.out.println("Sleeping zzzZZZzzz");
    }
}
class Horse extends SoundAnimal{

    @Override
    public void animalsound() {
        System.out.println("Neigh neigh");
    }
}
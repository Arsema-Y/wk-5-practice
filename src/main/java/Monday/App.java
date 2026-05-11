package Monday;

public class App {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.setName("Luna");

        //input name string into a var for printing
        String animalName = animal1.getName();
        System.out.println(animalName);

        //__________________________________

        Cat cat = new Cat();

        cat.setName("Dina");
        cat.setBreed("tuxedo");

        String catName = cat.getName();
        String catBreed = cat.getBreed();
        System.out.println("My cat " + catName + " is a " + catBreed + " breed");

    }
}

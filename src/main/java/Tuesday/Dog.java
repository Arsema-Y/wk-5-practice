package Tuesday;

public class Dog extends Animal{

    //_____________________________
    //overriding methods

    @Override
    public void speak() {
        System.out.println("Bark! Bark!");
    }

    //__________________________
    //unique methods
    public void sniffButt(){
        System.out.println("The dog is doing a 3...");
    }
}

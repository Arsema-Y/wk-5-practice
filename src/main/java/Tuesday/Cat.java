package Tuesday;

public class Cat extends Animal{

    //_____________________________
    //overriding methods

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }

    //__________________________
    //unique methods
    public void spillWater(){
        System.out.println("Dina is spilling my water!");
    }
}

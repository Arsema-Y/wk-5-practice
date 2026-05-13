package Tuesday;

import java.util.ArrayList;

public class AnimalApp {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        // data type, i : ArrayList (i : arrayList element, index)
        for(Animal animal: animals){
            animal.speak();

            if (animal instanceof Dog){
                //referencing parent method
                //make a dog out of animal instance/object

                /* w/o casting
                animal.sniffButt();
                -> error
                 */

                //casting
                //make a dog out of animal instance/object
                Dog dog = (Dog) animal;

                //another type of casting: ((Dog) animal).sniffButt();
                dog.sniffButt();
            } if(animal instanceof Cat){
                ((Cat) animal).spillWater();
            }
        }



    }


}

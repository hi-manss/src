import packagea.Animal;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
// asas

    animal.setId(10);
    animal.setName("HEllO");
    Animal animal1= new Animal();
    animal1.setId(2);
        System.out.println(animal1.getId());
        System.out.println(animal.getName());
        Animal.ds();
// ;       Animal.B.setId(10);
//        Animal.B.setName("Saa");
//        System.out.println(Animal.B.getId());
//        System.out.println(Animal.B.getName());
//        System.out.println(args[0]);


        System.out.println("------------------------------------------------------------------------------");

        Random random =  new Random();
        System.out.println(random.nextInt(100000,999999 ));
        System.out.println(random.nextDouble(1000,221212));


        System.out.println("------------------------------------------------------------------------------");




















    }
}
package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("Max","huskey",'M',2,"small","White");

        dog.eat();
        dog.drink();
        dog.sleeping();
        dog.moving();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");

        cat.eat();
        cat.sleeping();
        cat.drink();
        cat.moving();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'F',5,"Large","Orange");

        tiger.eat();
        tiger.sleeping();
        tiger.drink();
        tiger.moving();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);
    }
}

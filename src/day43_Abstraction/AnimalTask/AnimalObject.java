package day43_Abstraction.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Cat cat = new Cat("Lucy");
        cat.eat();
        System.out.println(cat);

        System.out.println("================================");

        Dog dog = new Dog("Jack");
        dog.eat();
        System.out.println(dog);

        System.out.println("=======================================");

        Eagle eagle = new Eagle("White");
        eagle.eat();
        System.out.println(eagle);

        System.out.println("=====================================");

        Tiger tiger = new Tiger("Shir khan");
        tiger.eat();
        System.out.println(tiger);

        System.out.println("========================");



    }
}

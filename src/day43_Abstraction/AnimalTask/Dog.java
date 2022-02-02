package day43_Abstraction.AnimalTask;

public final class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }

    @Override
    public String getName() {
        return super.getName();
    }


}

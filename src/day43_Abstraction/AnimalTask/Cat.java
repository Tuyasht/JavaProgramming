package day43_Abstraction.AnimalTask;

public final class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}


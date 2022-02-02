package day43_Abstraction.AnimalTask;

public final class Eagle extends Animal {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");

    }

    @Override
    public String getName() {
        return super.getName();
    }
}

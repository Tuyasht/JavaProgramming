package day43_Abstraction.AnimalTask;

public final class Tiger extends Animal{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

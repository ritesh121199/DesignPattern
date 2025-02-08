package StructuralDesignPattern.DecoratorPattern;

public class Mushroom extends ToppingDecorator{

    public Mushroom(BasePizza x) {
        super();
    }

    public int getCost(){
        return basePizza.getCost()+8;
    }
}

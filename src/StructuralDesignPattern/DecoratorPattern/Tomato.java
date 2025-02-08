package StructuralDesignPattern.DecoratorPattern;

// it is concretedecorator 
public class Tomato extends ToppingDecorator{

    public Tomato(BasePizza al) {
        super();
    }

    public int getCost(){
        return basePizza.getCost()+5;
    }
}

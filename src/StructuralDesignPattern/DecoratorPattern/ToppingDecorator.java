package StructuralDesignPattern.DecoratorPattern;

// it is abstract class that is being used to add different type of feature on base
// it consist both is-a(extends base class) and has-a(consist baseclass obejct) relationship
// it is decorator pattern
public abstract class ToppingDecorator extends BasePizza{

    BasePizza basePizza;
}

package lab.assignment.afterrefactoring;

public class Americano extends CoffeeTemplate{

    @Override
    protected void addIngredients() {

        System.out.println("Adding espresso");
        System.out.println("Adding hot water");
    }

    @Override
    protected void finalTouch() {

        System.out.println("Adding sugar");
    }
}
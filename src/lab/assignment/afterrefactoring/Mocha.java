package lab.example.afterrefactoring;

public class Mocha extends CoffeeTemplate{

    @Override
    protected void addIngredients() {

        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch() {

        System.out.println("Top with milk foam");
    }
}
package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;

public class CoffeeClient {

 public static void main(String[] args) {
        CoffeeTemplate starbuzz = new Mocha();
        
        
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new Capuccino();
        starbuzz.prepareCoffee();
       
        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepareCoffee();
    }
}
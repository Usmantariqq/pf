/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzams;

/**
 *
 * @author Ramis
 */
abstract class PizzaBuilder implements IToppings {
    
    protected Pizza pizza;
    
    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzams;

import pizzams.Pizza;
import pizzams.PizzaDecorator;

/**
 *
 * @author Ramis
 */
class ChickenTikkaPizza extends PizzaDecorator {
    
    public ChickenTikkaPizza(Pizza newPizza) {
        super(newPizza);
        newPizza.setDecorate(newPizza.getDecorate()+" 'Chicken Tikka'");
    }
}

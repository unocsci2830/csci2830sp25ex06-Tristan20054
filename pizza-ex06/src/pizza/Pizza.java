package pizza;


import java.util.ArrayList;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;


public class Pizza implements MenuItem {
    PizzaCrust crust;

    PizzaSauce sauce;

    ArrayList<PizzaTopping> toppings;

    ArrayList<MenuItem> pizzaComps;


    public String toString() {
        return "Pizza";
    }

    public int getPrice() {
	int s = 0;

	for (int i = 0;i<this.pizzaComps.size();i++) {
		s+=this.pizzaComps.get(i).getPrice();
	}
	return s;
    }
}
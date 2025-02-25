package pizza.sauce;

import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
    public abstract String toString();


    public String toNiceString() {
        return "Pizza Sauce";

    }

    public int getPrice() {
	if (this.toString() == "Alfredo Sauce") {
		return 4;
	} else {
		return 5;
	}
    }
}
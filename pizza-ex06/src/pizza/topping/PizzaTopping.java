package pizza.topping;

import pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
    public abstract String toString();

    public String toNiceString() {
	return "Pizza Topping";
    }

    public int getPrice() {

	if (this.toString() == "Sausage Topping") {
		return 2;
	} else if (this.toString() == "Pepperoni Topping") {
		return 1;
	} else if (this.toString() == "Beef Topping") {
		return 3;
	} else if (this.toString() == "Chicken Topping") {
		return 4;
	} else if (this.toString() == "Pineapple Topping") {
		return 2;
	} else if (this.toString() == "Apple Topping") {
		return 1;
	} else if (this.toString() == "Lettuce Topping") {
		return 3;
	} else if (this.toString() == "Mango Topping") {
		return 2;
	} else if (this.toString() == "Black Cheese Topping") {
		return 1;
	} else if (this.toString() == "Parmesean Topping") {
		return 5;
	} else if (this.toString() == "Yellow Cheese Topping") {
		return 2;
	} else if (this.toString() == "White Cheese Topping") {
		return 4;
	} else {
		return 0;
	}
    }


}
package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
   public abstract String toString();

   public String crustIngredient;

   public String checkIntegrity() {
	if (crustIngredient=="Cauliflower") {
		return "Handle carefully as pizza may fall apart!";
	}

	return "";

   }

   public int getPrice() {
	if (this.toString() == "Thick Crust") {
		return 10;
	} else {
		return 5;
	}
   }

   public abstract String toNiceString();
}
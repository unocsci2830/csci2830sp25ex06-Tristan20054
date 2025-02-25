package pizza.crust;

public class ThickCrust extends PizzaCrust {

    public boolean deepDish;

    public String toString() {
	return "Thick Crust";

    }

    public String toNiceString() {
        if (deepDish == true) {
		return "Thick crust deepdished with " + crustIngredient;
	}

	return "Thick crust not deepdished with " + crustIngredient;
    }


}
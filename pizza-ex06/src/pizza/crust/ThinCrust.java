package pizza.crust;

public class ThinCrust extends PizzaCrust {
    public String toString() {
        return "Thin Crust";
    }

	public String toNiceString() {

	return "Thin crust with " + crustIngredient;
    }
}
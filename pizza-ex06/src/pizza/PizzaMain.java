
package pizza;

import java.util.Scanner;

import pizza.crust.*;
import pizza.sauce.*;
import pizza.topping.*;

import java.util.ArrayList;

public class PizzaMain {
    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);

	ArrayList<MenuItem> main = new ArrayList<MenuItem>();
        
	Pizza mainPizza = new Pizza();

	ThinCrust myThin = new ThinCrust();
	ThickCrust myThick = new ThickCrust();

        System.out.println("What Crust would you like:");
	System.out.println("1 - Thin Crust - $" +  myThin.getPrice());
	System.out.println("2 - Thick Crust - $" + myThick.getPrice());
	System.out.println("Your Choice: ");

	int choice = inp.nextInt();

	if (choice==1) {
		mainPizza.crust = myThin;

	} else {

		System.out.println("Do you want that Deep Dished?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		System.out.println("Your Choice: ");

		choice = inp.nextInt();

		if (choice==1) {
			myThick.deepDish = true;

		} else {
			myThick.deepDish = false;

		}

		mainPizza.crust = myThick;

		

	}

	main.add(mainPizza.crust);

	System.out.println("What Crust Ingredient would you like:");
	System.out.println("1 - Flour");
	System.out.println("2 - Cauliflower");
	System.out.println("Your Choice: ");

	choice = inp.nextInt();

	if (choice==1) {
		mainPizza.crust.crustIngredient = "Flour";

	} else {
		mainPizza.crust.crustIngredient = "Cauliflower";

	}

	Tomato sauce1 = new Tomato();
	Alfredo sauce2 = new Alfredo();
	

	System.out.println("What Sauce would you like:");
	System.out.println("1 - Tomato - $" + sauce1.getPrice());
	System.out.println("2 - Alfredo - $" + sauce2.getPrice());
	System.out.println("Your Choice: ");

	choice = inp.nextInt();

	if (choice==1) {
		mainPizza.sauce = sauce1;

	} else {
		mainPizza.sauce = sauce2;

	}

	main.add(mainPizza.sauce);

	
	int num = 99;


	while (num>4||num<0) {

	System.out.println("How Many Toppings?");
	num = inp.nextInt();


	}
	ArrayList<PizzaTopping> newList = new ArrayList<PizzaTopping>();

	Pepperoni p1 = new Pepperoni();
	Beef p2 = new Beef();
	Chicken p3 = new Chicken();
	Pineapple p4 = new Pineapple();
	Sausage p5 = new Sausage();
	Apple p6 = new Apple();
	Lettuce p7 = new Lettuce();
	Mango p8 = new Mango();
	BlackCheese p9 = new BlackCheese();
	Parmesean p10 = new Parmesean();
	YellowCheese p11 = new YellowCheese();
	WhiteCheese p12 = new WhiteCheese();

	for (int i = 0;i<num;i++) {
		System.out.println("1 - Sausage - $" + p5.getPrice());
	System.out.println("2 - Pepperoni - $" + p1.getPrice());
	System.out.println("3 - Beef - $" + p2.getPrice());
	System.out.println("4 - Chicken - $" + p3.getPrice());
	System.out.println("5 - Pineapple - $" + p4.getPrice());
	System.out.println("6 - Apple - $" + p6.getPrice());
	System.out.println("7 - Lettuce - $" + p7.getPrice());
	System.out.println("8 - Mango - $" + p8.getPrice());
	System.out.println("9 - BlackCheese - $" + p9.getPrice());
	System.out.println("10 - Parmesean - $" + p10.getPrice());
	System.out.println("11 - Yellow Cheese - $" + p11.getPrice());
	System.out.println("12 - White Cheese - $" + p12.getPrice());

	choice = inp.nextInt();

	if (choice==1) {
		Sausage topping = new Sausage();
		newList.add(topping);
		main.add(topping);

	} else if (choice==2){
		Pepperoni topping = new Pepperoni();
		newList.add(topping);
		main.add(topping);

	}else if (choice==3){
		Beef topping = new Beef();
		newList.add(topping);
		main.add(topping);

	}else if (choice==4){
		Chicken topping = new Chicken();
		newList.add(topping);
		main.add(topping);

	}else if (choice==5){
		Pineapple topping = new Pineapple();
		newList.add(topping);
		main.add(topping);

	}else if (choice==6){
		Apple topping = new Apple();
		newList.add(topping);
		main.add(topping);

	}else if (choice==7){
		Lettuce topping = new Lettuce();
		newList.add(topping);
		main.add(topping);

	}else if (choice==8){
		Mango topping = new Mango();
		newList.add(topping);
		main.add(topping);

	}else if (choice==9){
		BlackCheese topping = new BlackCheese();
		newList.add(topping);
		main.add(topping);

	}else if (choice==10){
		Parmesean topping = new Parmesean();
		newList.add(topping);
		main.add(topping);

	}else if (choice==11){
		YellowCheese topping = new YellowCheese();
		newList.add(topping);
		main.add(topping);

	}else if (choice==12){
		WhiteCheese topping = new WhiteCheese();
		newList.add(topping);
		main.add(topping);

	}

	

	}

	mainPizza.toppings = newList;
	mainPizza.pizzaComps = main;


	System.out.println("Your Sauce is:");
	System.out.println(mainPizza.sauce.toString());
System.out.println("\n");
	System.out.println("Your Crust is:");
	System.out.println(mainPizza.crust.toNiceString());
	System.out.println("\n");
	

	System.out.println("Your Toppings are:");
	for (int i = 0;i<mainPizza.toppings.size();i++) {
		System.out.println(mainPizza.toppings.get(i).toString());

	}

	if (mainPizza.crust.toString() == "Thick Crust") {
		System.out.println(mainPizza.crust.checkIntegrity());
	}

	

	System.out.println("\nTotal Price: $" + mainPizza.getPrice());
	
	

	

	
	

	
    }
}
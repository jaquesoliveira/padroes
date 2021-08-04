package padroes.decorator.model.decorators;

import padroes.decorator.Drink;

public abstract class DrinkDecorator implements Drink {
	
	protected Drink drink;

	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}

package padroes.decorator.model.decorators;

import padroes.decorator.Drink;

public class Milk extends DrinkDecorator{

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("Serve 30ml de chá");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5;
	}

}

package padroes.decorator;

public class Tea implements Drink {

	@Override
	public void serve() {
		System.out.println("Serve 50ml de chá");
	}

	@Override
	public Double getPrice() {
		return 1.5;
	}
}
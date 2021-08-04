package padroes.decorator;

import padroes.decorator.model.decorators.AviaoDecorator;
import padroes.decorator.model.decorators.DoisMotoresAJato;
import padroes.decorator.model.decorators.DoubleDrink;
import padroes.decorator.model.decorators.Milk;
import padroes.decorator.model.decorators.Turbo;
import padroes.decorator.model.decorators.UmMotorTurboHelice;

public class Main {
	
//	public static void order(String name, Drink drink) {
//		System.out.println("----------");
//		System.out.println("Ordering a " + name);
//		drink.serve();
//		
//		System.out.println(drink.getPrice());
//		System.out.println("----------");
//	}
	
	public static void voar(Double distancia, Aviao aviao) {
		System.out.println("----------");
		System.out.println("Voando uma distância de " + distancia);
		aviao.acionarTurbina();
		
		System.out.println("Viaja a " + aviao.getVelocidade() + " Km/h");
		System.out.println("Tempo de voo " + aviao.getTempoDeVoo(distancia) + " horas");		
		System.out.println("----------");
	}

	public static void main(String[] args) {
		voar(1000D, new AviaoImpl());
		voar(1000D, new UmMotorTurboHelice( new AviaoImpl()) );
		voar(1000D, new DoisMotoresAJato( new AviaoImpl()) );
		voar(1000D, new Turbo(new DoisMotoresAJato( new AviaoImpl())) );
//		order("Chá", new Tea());
//		
//		order("Chá duplo", new DoubleDrink(new Tea()) );
//		
//		order("Chá duplo com leite", new Milk(new DoubleDrink(new Tea())) );
	}
}
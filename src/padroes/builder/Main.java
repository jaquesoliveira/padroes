package padroes.builder;

public class Main {
	
	public static void pedir(String nome, RefeicaoBuilder builder) {
		System.out.println("Pedindo um:" + nome);
		RefeicaoDirector director = new RefeicaoDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
	}

	public static void teste(Object ... args){
		for(Object str : args) {
			System.out.println(str.getClass().getTypeName() );
		}
	}
	
	public static void main(String[] args) {
        //pedir("Refeicao Light", new RefeicaoLight());
		teste(1, "jaques", "morais", "oliveira");		
	}
}

package padroes.builder.fluent;

public class Main {

	public static void main(String[] args) {
		
		Refeicao refeicaoLight = new RefeicaoBuilderFluent()
			.buidPeoteina(Opcoes.FRANGO_GRELHADO.getDescricao())
			.buidSalada(Opcoes.SALADA_CRUA.getDescricao())
			.buidSobreMesa(Opcoes.MACA.getDescricao())
			.buidBebida(Opcoes.SUCO.getDescricao())
			.finalizarRefeicao();
		
		System.out.println(refeicaoLight);
	}
}
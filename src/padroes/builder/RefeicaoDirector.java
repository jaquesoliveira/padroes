package padroes.builder;

public class RefeicaoDirector {
	private RefeicaoBuilder builder;
	
	public RefeicaoDirector(RefeicaoBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buidArroz();
		builder.buidFeija();
		builder.buidAssadoDePanela();
		builder.buidBebida();
		builder.buidBife();
		builder.buidMacarrao();
		builder.buidPeitoDeFranfoGrelhado();
		builder.buidSaladaCozida();
		builder.buidSaladaCrua();
		builder.buidSobremesa();
	}
	
	public Refeicao getCombo() {
		return builder.getRefeicao();
	}
}

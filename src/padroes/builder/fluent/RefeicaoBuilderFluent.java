package padroes.builder.fluent;

public class RefeicaoBuilderFluent{
	
	private String opcao1;
	private String opcao2;
	private String opcao3;
	private String salada; 
	private String proteina;
	private String bebida;
	private String sobreMesa;
		
	public RefeicaoBuilderFluent buidOpcao1(final String opcao) {
		this.opcao1 = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidOpcao2(final String opcao) {
		this.opcao2 = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidOpcao3(final String opcao) {
		this.opcao3 = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidSalada(final String opcao) {
		this.salada = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidPeoteina(final String opcao) {
		this.proteina = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidBebida(final String opcao) {
		this.bebida = opcao;
		return this;
	}
	
	public RefeicaoBuilderFluent buidSobreMesa(final String opcao) {
		this.sobreMesa = opcao;
		return this;
	}
	
	public Refeicao finalizarRefeicao() {
		return new Refeicao(opcao1, opcao2, opcao3, salada, proteina, bebida, sobreMesa);
	}
}

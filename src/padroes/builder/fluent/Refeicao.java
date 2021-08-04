package padroes.builder.fluent;

public class Refeicao {
	
	private String opcao1;
	private String opcao2;
	private String opcao3;
	private String salada;
	private String proteina; 
	private String bebida;
	private String sobreMesa;

	public Refeicao(String opcao1, String opcao2, String opcao3, String salada, String proteina, String bebida,
			String sobreMesa) {
		super();
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcao3 = opcao3;
		this.salada = salada;
		this.proteina = proteina;
		this.bebida = bebida;
		this.sobreMesa = sobreMesa;
	}

	public String getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(String opcao1) {
		this.opcao1 = opcao1;
	}

	public String getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(String opcao2) {
		this.opcao2 = opcao2;
	}

	public String getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(String opcao3) {
		this.opcao3 = opcao3;
	}

	public String getSalada() {
		return salada;
	}

	public void setSalada(String salada) {
		this.salada = salada;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getSobreMesa() {
		return sobreMesa;
	}

	public void setSobreMesa(String sobreMesa) {
		this.sobreMesa = sobreMesa;
	}

	@Override
	public String toString() {
		return "Refeicao [opcao1=" + opcao1 + ", opcao2=" + opcao2 + ", opcao3=" + opcao3 + ", salada=" + salada
				+ ", proteina=" + proteina + ", bebida=" + bebida + ", sobreMesa=" + sobreMesa + "]";
	}
	
}

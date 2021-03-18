package poo;

public class Cartao {
	/**
	 * Atribuiçao de variaveis
	 */
	// atributos
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
/**
 * Distribuiçao 
 * @param nomeFuncionario
 * @param servico
 * @param cargo
 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}
/**
 * 
 * @return
 */
	// Acessores
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}

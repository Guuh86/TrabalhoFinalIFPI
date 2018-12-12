package inscricao.campeonato;


public class Participante {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private String dataNasc;
	
	public Participante(String nome, String cpf, String rg, String endereco, String dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getRg() {
		return rg;
	}


	public String getEndereco() {
		return endereco;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	@Override
	public String toString() {
		return "Inscricao [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", dataNasc="
				+ dataNasc + "]";
	}
	
	
	
	

}

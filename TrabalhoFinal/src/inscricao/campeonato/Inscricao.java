package inscricao.campeonato;

import java.util.Date;

public class Inscricao {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private Date dataNasc;
	
	public Inscricao(String nome, String cpf, String rg, String endereco, Date dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}
	
	public Inscricao() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Inscricao [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", dataNasc="
				+ dataNasc + "]";
	}
	
	
	
	

}

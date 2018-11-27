package inscricao.campeonato;

import java.util.Date;

public class InscDuo extends Inscricao{
	private String nomeDuo;

	public InscDuo(String nome, String cpf, String rg, String endereco, Date dataNasc, String nomeDuo) {
		super(nome, cpf, rg, endereco, dataNasc);
		this.nomeDuo = nomeDuo;
	}
	
	public InscDuo() {
		
	}

	public String getNomeDuo() {
		return nomeDuo;
	}

	public void setNomeDuo(String nomeDuo) {
		this.nomeDuo = nomeDuo;
	}

	@Override
	public String toString() {
		return "InscDuo [nomeDuo=" + nomeDuo + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

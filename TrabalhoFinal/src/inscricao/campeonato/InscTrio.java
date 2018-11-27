package inscricao.campeonato;

import java.util.Date;

public class InscTrio extends Inscricao{
	private String nomeTrio;

	public InscTrio(String nome, String cpf, String rg, String endereco, Date dataNasc, String nomeTrio) {
		super(nome, cpf, rg, endereco, dataNasc);
		this.nomeTrio = nomeTrio;
	}
	
	public InscTrio() {
		
	}

	public String getNomeTrio() {
		return nomeTrio;
	}

	public void setNomeTrio(String nomeTrio) {
		this.nomeTrio = nomeTrio;
	}

	@Override
	public String toString() {
		return "InscTrio [nomeTrio=" + nomeTrio + ", toString()=" + super.toString() + "]";
	}
	
	

}

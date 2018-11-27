package inscricao.campeonato;

import java.util.Date;

public class InscQuad extends Inscricao{
	private String InscQuad;

	public InscQuad(String nome, String cpf, String rg, String endereco, Date dataNasc, String inscQuad) {
		super(nome, cpf, rg, endereco, dataNasc);
		InscQuad = inscQuad;
	}
	
	public InscQuad() {
		
	}

	public String getInscQuad() {
		return InscQuad;
	}

	public void setInscQuad(String inscQuad) {
		InscQuad = inscQuad;
	}

	@Override
	public String toString() {
		return "InscQuad [InscQuad=" + InscQuad + ", toString()=" + super.toString() + "]";
	}
	
	

}

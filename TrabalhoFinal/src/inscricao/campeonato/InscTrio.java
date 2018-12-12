package inscricao.campeonato;

import java.util.Date;

public class InscTrio extends Inscricao{
	private nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	
	public InscTrio(String nome, Participante p1, Participante p2, Participante p3) {
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
		this.participantes.add(p3);
	}


	@Override
	public String toString() {
		return "InscTrio [nomeTrio=" + nomeTrio + ", toString()=" + super.toString() + "]";
	}
	
	

}

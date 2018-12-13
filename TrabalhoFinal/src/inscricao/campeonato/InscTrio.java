package inscricao.campeonato;

import java.util.LinkedList;

public class InscTrio extends Inscricao{
	private String nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	private final int NUM_PARTICIP = 3;
	
	public InscTrio(String nome, Participante p1, Participante p2, Participante p3) {
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
		this.participantes.add(p3);
		setNUM_PARTICIP(this.NUM_PARTICIP);
	}
	
	public InscTrio() {
		setNUM_PARTICIP(this.NUM_PARTICIP);
	}
	
	@Override
	public String toString() {
		return "InscTrio [nomeTrio=" + nomeEquipe + ", toString()=" + super.toString() + "]";
	}

}

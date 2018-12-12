package inscricao.campeonato;

import java.util.LinkedList;

public class InscQuad extends Inscricao{
	private String nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	private final int NUM_PARTICIP = 4;
	
	public InscQuad(String nome, Participante p1, Participante p2, Participante p3, Participante p4) {
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
		this.participantes.add(p3);
		this.participantes.add(p4);
	}
	
	@Override
	public int getNumParticipantes() {
		return this.NUM_PARTICIP;
	}

	
	@Override
	public String toString() {
		return "InscQuad [InscQuad=" + nomeEquipe + ", toString()=" + super.toString() + "]";
	}
	
	

}

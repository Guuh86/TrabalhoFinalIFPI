package inscricao.campeonato;

import java.util.Date;

public class InscQuad extends Inscricao{
	private nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	
	public InscTrio(String nome, Participante p1, Participante p2, Participante p3) {
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
		this.participantes.add(p3);
		this.participantes.add(p4);
	}
	
	@Override
	public String toString() {
		return "InscQuad [InscQuad=" + InscQuad + ", toString()=" + super.toString() + "]";
	}
	
	

}

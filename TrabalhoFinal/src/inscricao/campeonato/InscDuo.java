package inscricao.campeonato;

import java.util.Date;

public class InscDuo extends Inscricao{
	
	private nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();

	public InscDuo(String nome, Participante p1, Participante p2){
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
	}
	
	@Override
	public String toString() {
		return "InscDuo [nomeDuo=" + nomeDuo + ", toString()=";
	}

	
}

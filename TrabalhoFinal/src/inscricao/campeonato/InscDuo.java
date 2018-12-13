package inscricao.campeonato;
import java.util.LinkedList;

public class InscDuo extends Inscricao{
	
	private String nomeEquipe;
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	private final int NUM_PARTICIP = 2;

	public InscDuo(String nome, Participante p1, Participante p2){
		this.nomeEquipe = nome;
		this.participantes.add(p1);
		this.participantes.add(p2);
		setNUM_PARTICIP(this.NUM_PARTICIP);
		
	}
	
	public InscDuo() {
		setNUM_PARTICIP(this.NUM_PARTICIP);
	}
	
	
	@Override
	public String toString() {
		return "InscDuo [nomeDuo=" + nomeEquipe + ", toString()=";
	}

}

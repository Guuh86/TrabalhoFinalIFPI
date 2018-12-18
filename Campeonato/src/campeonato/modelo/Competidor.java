package campeonato.modelo;

public class Competidor {
	private long id;
	private String nome;
	private String rg;
	private String sexo;
	private String telefone;
	private String estiloMusical;
	
	public Competidor(long id, String nome, String rg, String sexo, String telefone, String estiloMusical) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.sexo = sexo;
		this.telefone = telefone;
		this.estiloMusical = estiloMusical;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estiloMusical == null) ? 0 : estiloMusical.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competidor other = (Competidor) obj;
		if (estiloMusical == null) {
			if (other.estiloMusical != null)
				return false;
		} else if (!estiloMusical.equals(other.estiloMusical))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Competidor [id=").append(id).append(", nome=").append(nome).append(", rg=").append(rg)
				.append(", sexo=").append(sexo).append(", telefone=").append(telefone).append(", estiloMusical=")
				.append(estiloMusical).append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

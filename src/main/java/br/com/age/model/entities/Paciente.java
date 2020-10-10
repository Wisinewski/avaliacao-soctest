package br.com.age.model.entities;

import java.util.Date;

public class Paciente {

	private String nome;
	
	private Date criadoEm;
	//private Date atualizadoEm;
	
	public Paciente(String nome) {
		this.nome = nome;
		criadoEm = new Date();
		//atualizadoEm = criadoEm;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getCriadoEm() {
		return this.criadoEm;
	}
	
	/*public Date getAtualizadoEm() {
		return this.atualizadoEm;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Paciente other = (Paciente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + "]";
	}
	
}

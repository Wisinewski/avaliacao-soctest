package br.com.age.model.entities;

import java.util.Date;

public class Exame {

	private String nomePaciente;
	private String nomeExame;
	private Date dataExame;
	private String observacaoExame;
	
	public Exame(String nomePaciente, String nomeExame) {
		this.nomePaciente = nomePaciente;
		this.nomeExame = nomeExame;
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public String getNomeExame() {
		return nomeExame;
	}
	
	public Date getDataExame() {
		return dataExame;
	}
	
	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}
	
	public String getObservacaoExame() {
		return observacaoExame;
	}
	
	public void setObservacaoExame(String observacaoExame) {
		this.observacaoExame = observacaoExame;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exame other = (Exame) obj;
		if (nomeExame == null) {
			if (other.nomeExame != null)
				return false;
		} else if (!nomeExame.equals(other.nomeExame))
			return false;
		if (nomePaciente == null) {
			if (other.nomePaciente != null)
				return false;
		} else if (!nomePaciente.equals(other.nomePaciente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exame [nomePaciente=" + nomePaciente + ", nomeExame=" + nomeExame + ", dataExame=" + dataExame
				+ ", observacaoExame=" + observacaoExame + "]";
	}
	
}

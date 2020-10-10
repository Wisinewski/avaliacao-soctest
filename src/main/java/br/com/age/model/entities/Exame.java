package br.com.age.model.entities;

import java.util.Date;

import br.com.age.exceptions.DatePassedException;

public class Exame {

	private Paciente paciente;
	private String nomeExame;
	private Date dataExame;
	private String observacaoExame;
	
	private Date criadoEm;
	private Date atualizadoEm;
	
	public Exame(String nomeExame, Paciente paciente) {
		this.paciente = paciente;
		this.nomeExame = nomeExame;
		criadoEm = new Date();
		atualizadoEm = criadoEm;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public String getNomeExame() {
		return nomeExame;
	}
	
	public Date getDataExame() {
		return dataExame;
	}
	
	public void setDataExame(Date dataAtual, Date dataExame) throws DatePassedException {
		if(verificaSeDataExameMaiorQueDataAtual(dataAtual, dataExame)) {
			this.dataExame = dataExame;
			setAtualizadoEm(new Date());
			return;
		}
		throw new DatePassedException("Data exame menor ou igual à data atual");
	}
	
	private boolean verificaSeDataExameMaiorQueDataAtual(Date dataAtual, Date dataExame) {
		return dataExame.after(dataAtual);
	}
	
	public String getObservacaoExame() {
		return observacaoExame;
	}
	
	public void setObservacaoExame(String observacaoExame) {
		this.observacaoExame = observacaoExame;
		setAtualizadoEm(new Date());
	}
	
	public Date getCriadoEm() {
		return this.criadoEm;
	}
	
	public Date getAtualizadoEm() {
		return this.atualizadoEm;
	}
	
	private void setAtualizadoEm(Date date) {
		this.atualizadoEm = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeExame == null) ? 0 : nomeExame.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
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
		Exame other = (Exame) obj;
		if (nomeExame == null) {
			if (other.nomeExame != null)
				return false;
		} else if (!nomeExame.equals(other.nomeExame))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exame [nomePaciente=" + paciente.getNome() + ", nomeExame=" + nomeExame + ", dataExame=" + dataExame
				+ ", observacaoExame=" + observacaoExame + "]";
	}
	
}

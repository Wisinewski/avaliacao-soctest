package br.com.age.model.entities.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.age.exceptions.DatePassedException;
import br.com.age.model.entities.Exame;
import br.com.age.model.entities.Paciente;

class ExameTest {
	
	private final Date dataAtual = new Date();
	
	private Paciente paciente;
	private final String nomePaciente = "Giancarlo";
	
	private Exame exame;
	private final String nomeExame = "Exame_01";
	private final Date dataExame = new Date();
	private String observacaoExame = "Positivo";
	
	@BeforeEach
	void getInstanceExame() {
		this.paciente = new Paciente(nomePaciente);
		this.exame = new Exame(nomeExame, paciente);
	}

	@Test
	void exameDeveSerCriado() {
		assertNotNull(exame);
	}
	
	@Test
	void exameDevePossuirInicialmentePaciente() {
		assertEquals(paciente, exame.getPaciente());
	}
	
	@Test
	void exameDevePossuirInicialmenteNomeExame() {
		assertEquals(nomeExame, exame.getNomeExame());
	}
	
	@Test
	void exameDevePossuirInicialmenteDataCriacao() {
		assertNotNull(exame.getCriadoEm());
	}
	
	@Test
	void exameDevePossuirInicialmenteDataAtualizacao() {
		assertNotNull(exame.getAtualizadoEm());
	}
	
	@Test
	void exameDevePossuirDataExame() throws Exception {
		dataExame.setTime(dataAtual.getTime() + 1000);
		setDataExame(dataExame);
		assertEquals(dataExame, exame.getDataExame());
	}
	
	@Test
	void exameDeveTerDataExameAtualizada() throws Exception {
		dataExame.setTime(dataAtual.getTime() + 1000);
		setDataExame(dataExame);
		
		dataExame.setTime(dataAtual.getTime() + 2000);
		setDataExame(dataExame);
		
		assertEquals(dataExame, exame.getDataExame());
	}
	
	@Test
	void deveEstourarExceptionAoSetarDataExameMenorQueDataAtual() throws DatePassedException {
		assertThrows(DatePassedException.class, () -> {
			dataExame.setTime(dataAtual.getTime());
			setDataExame(dataExame);
		});
	}
	
	@Test
	void exameDevePossuirDataAtualizacaoDiferenteDeDataCriacao() throws Exception {
		dataExame.setTime(dataAtual.getTime() + 1000);
		
		// simula tempo corrido até uma atualização ocorrer manualmente
		Thread.sleep(1);
		
		setDataExame(dataExame);
		assertNotEquals(exame.getCriadoEm(), exame.getAtualizadoEm());
	}
	
	private void setDataExame(Date dataExame) throws Exception {
		exame.setDataExame(dataAtual, dataExame);
	}
	
	@Test
	void exameDevePossuirObservacaoExame() {
		setObservacaoExame(observacaoExame);
		assertEquals(observacaoExame, exame.getObservacaoExame());
	}
	
	@Test
	void exameDeveTerObservacaoExameAtualizada() {
		setObservacaoExame(observacaoExame);
		observacaoExame = "Negativo";
		setObservacaoExame(observacaoExame);
		assertEquals(observacaoExame, exame.getObservacaoExame());
	}
	
	private void setObservacaoExame(String observacaoExame) {
		exame.setObservacaoExame(observacaoExame);
	}
	
}

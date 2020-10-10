package br.com.age.model.entities.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.age.model.entities.Exame;

class ExameTest {
	
	private Exame exame;
	
	private final String nomePaciente = "Giancarlo";
	private final String nomeExame = "Exame_01";
	
	private final Date dataExame = new Date();
	private final String observacaoExame = "Positivo";
	
	private final Date dataExameAtualizada = new Date();
	private final String observacaoExameAtualizada = "Negativo";
	
	@BeforeEach
	void getInstanceExame() {
		this.exame = new Exame(nomePaciente, nomeExame);
	}

	@Test
	void exameDeveSerCriado() {
		assertNotNull(exame);
	}
	
	@Test
	void exameDevePossuirInicialmenteNomePaciente() {
		assertEquals(nomePaciente, exame.getNomePaciente());
	}
	
	@Test
	void exameDevePossuirInicialmenteNomeExame() {
		assertEquals(nomeExame, exame.getNomeExame());
	}
	
	@Test
	void exameDevePossuirDataExame() {
		setDataExame(dataExame);
		assertEquals(dataExame, exame.getDataExame());
	}
	
	@Test
	void exameDeveTerDataExameAtualizada() {
		setDataExame(dataExame);
		setDataExame(dataExameAtualizada);
		assertEquals(dataExameAtualizada, exame.getDataExame());
	}
	
	private void setDataExame(Date dataExame) {
		exame.setDataExame(dataExame);
	}
	
	@Test
	void exameDevePossuirObservacaoExame() {
		setObservacaoExame(observacaoExame);
		assertEquals(observacaoExame, exame.getObservacaoExame());
	}
	
	@Test
	void exameDeveTerObservacaoExameAtualizada() {
		setObservacaoExame(observacaoExame);
		setObservacaoExame(observacaoExameAtualizada);
		assertEquals(observacaoExameAtualizada, exame.getObservacaoExame());
	}
	
	private void setObservacaoExame(String observacaoExame) {
		exame.setObservacaoExame(observacaoExame);
	}
	
	

}

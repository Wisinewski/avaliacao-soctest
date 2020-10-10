package br.com.age.model.entities.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.age.model.entities.Paciente;

class PacienteTest {
	
	private Paciente paciente;
	private String nomePaciente = "Giancarlo";
	
	@BeforeEach
	void getInstancePaciente() {
		paciente = new Paciente("Giancarlo");
	}

	@Test
	void pacienteDeveSerCriado() {
		assertNotNull(paciente);
	}
	
	@Test
	void pacienteDevePossuirInicialmenteNome() {
		assertEquals(nomePaciente, paciente.getNome());
	}
	
	@Test
	void pacienteDevePossuirInicialmenteDataCriacao() {
		assertNotNull(paciente.getCriadoEm());
	}

}

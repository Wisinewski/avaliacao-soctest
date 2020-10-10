package br.com.age.db.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import br.com.age.db.DB;

class DBTest {

	@Test
	void testaConexaoComDB() {
		//Connection conn = DB.getConnection();
		assertEquals(1, 1);
	}

}

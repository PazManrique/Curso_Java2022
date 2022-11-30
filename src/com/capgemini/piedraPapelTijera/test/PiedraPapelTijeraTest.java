package com.capgemini.piedraPapelTijera.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.piedraPapelTijera.Papel;
import com.capgemini.piedraPapelTijera.Piedra;
import com.capgemini.piedraPapelTijera.PiedraPapelTijeraF;
import com.capgemini.piedraPapelTijera.Tijera;

class PiedraPapelTijeraTest {
	//lote de pruebas
	PiedraPapelTijeraF piedra,
					   papel,
					   tijera;

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel =  new Papel();
			tijera =	new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		papel = null;
		tijera = null;
	}

	@Test
	void testGetInstancePiedra_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PIEDRA)instanceof Piedra);
	}
	
	@Test
	void testGetInstancePapel_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PAPEL)instanceof Papel);
	}
	
	@Test
	void testGetInstanceTijera_true() {
		assertTrue(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.TIJERA)instanceof Tijera);
	}
	
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PIEDRA)instanceof Tijera);
	}
	
	@Test
	void testGetInstancePapel_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.PAPEL)instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera_false() {
		assertFalse(PiedraPapelTijeraF.getInstance(PiedraPapelTijeraF.TIJERA)instanceof Papel);
	}
	
	@Test
	void testPiedraLeGanaATijera() {
		assertEquals(1, piedra.comparar(tijera));

}
	
	@Test
	void testTijeraPierdePiedra() {
		assertEquals(-1, tijera.comparar(piedra));

}
}
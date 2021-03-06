package test.model.disparos;

import main.model.disparos.Disparo;
import main.model.disparos.PorContacto;
import main.model.tablero.Coordenada;

import org.junit.Assert;
import org.junit.Test;

public class PorContactoTest {
	
	@Test
	public void PorContactoCostoYRadioTest(){
		Disparo disparo = new PorContacto(new Coordenada(1, 2));
		Assert.assertTrue(disparo.getCosto() == 150);
		Assert.assertTrue(disparo.getRadio() == 0);
	}
	
	@Test
	public void accionarDisparoTest(){
		Disparo disparo = new PorContacto(new Coordenada(1, 2));
		boolean debeExplotar = disparo.debeExplotar();
		Assert.assertTrue(debeExplotar);
	}
	
}

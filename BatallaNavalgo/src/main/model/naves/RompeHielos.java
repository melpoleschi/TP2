package main.model.naves;

import main.model.disparos.Disparo;

public class RompeHielos extends Nave {

	@Override
	public void recibirDisparo(Disparo disparo , Parte parte){

		if (parte.recibioDisparo()) {
			parte.destruir();
		} else {
			parte.recibirDisparo();
		}
	}
}

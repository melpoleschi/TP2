package main.model.disparos;

import main.model.tablero.Coordenada;

/**
 * Representa a una Mina Submarina por Contacto.
 *
 * @author mariano.sanchez
 */
public class PorContacto extends MinaSubmarina{
	
	protected final Integer COSTO = 150;
	protected final Integer RADIO = 0;

	/**
	 * Constructor por defecto.
	 */
	public PorContacto(Coordenada coordenada){
		this.coordenada = coordenada;
		this.costo = COSTO;
		this.radio = RADIO;
	}
}

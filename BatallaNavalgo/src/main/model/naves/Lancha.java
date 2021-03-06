package main.model.naves;

import java.util.ArrayList;

import main.model.naves.EnumDirecciones.DireccionMovimiento;
import main.model.naves.EnumDirecciones.DireccionSentido;
import main.model.tablero.Coordenada;

public class Lancha extends Nave {
	
	protected final Integer CANTIDAD_PARTES = 2;

	public Lancha(){
		this.partes = new ArrayList<Parte> ();
	}
	
	public Lancha(Coordenada coordenadaInicio, DireccionSentido sentido, DireccionMovimiento movimiento){
		this.partes = new ArrayList<Parte> ();
		this.coordenadaInicio = coordenadaInicio;
		this.direccionSentido = sentido;
		this.direccionMovimiento = movimiento;
		this.agregarPartes(coordenadaInicio, this.CANTIDAD_PARTES);
	}
	
	public Integer getCANTIDAD_PARTES() {
		return CANTIDAD_PARTES;
	}

	@Override
	public int getX() {
		return 10 + 60*this.coordenadaInicio.getX();
	}

	@Override
	public int getY() {
		return 10 + 60*this.coordenadaInicio.getY();
	}
	
}

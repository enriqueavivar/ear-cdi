package com.tsystems.tu.negocio.objetos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Clase abstracta de vehículos.
 * 
 * @author krequena
 *
 */
@Entity
public abstract class AbstractVehiculo {

	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="ruedas")
	@Size(max=30)
	@NotNull
	private int ruedas;
	
	@Column(name="puertas")
	@Size(max=30)
	@NotNull
	private int puertas;
	
	

	/**
	 * @return the ruedas
	 */
	public final int getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas the ruedas to set
	 */
	public final void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * @return the puertas
	 */
	public final int getPuertas() {
		return puertas;
	}

	/**
	 * @param puertas the puertas to set
	 */
	public final void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
}

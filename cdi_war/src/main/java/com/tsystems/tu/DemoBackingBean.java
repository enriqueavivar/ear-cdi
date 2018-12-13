package com.tsystems.tu;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.tsystems.tu.negocio.logica.ColisionBO;
import com.tsystems.tu.negocio.objetos.AbstractVehiculo;
import com.tsystems.tu.negocio.objetos.Coche;

/**
 * Clase BackingBean demo.
 * @author krequena
 *
 */
@RequestScoped
@ManagedBean
public class DemoBackingBean {

	private static final Logger LOGGER = Logger.getLogger(DemoBackingBean.class);

	@Inject
	private ColisionBO colisionBO;

	private int puertas1;
	private int puertas2;

	private int totalPuertas;
	private int totalRuedas;

	/**
	 * @return the puertas1
	 */
	public final int getPuertas1() {
		return puertas1;
	}

	/**
	 * @param puertas1 the puertas1 to set
	 */
	public final void setPuertas1(int puertas1) {
		this.puertas1 = puertas1;
	}

	/**
	 * @return the puertas2
	 */
	public final int getPuertas2() {
		return puertas2;
	}

	/**
	 * @param puertas2 the puertas2 to set
	 */
	public final void setPuertas2(int puertas2) {
		this.puertas2 = puertas2;
	}

	/**
	 * @return the totalPuertas
	 */
	public final int getTotalPuertas() {
		return totalPuertas;
	}

	/**
	 * @param totalPuertas the totalPuertas to set
	 */
	public final void setTotalPuertas(int totalPuertas) {
		this.totalPuertas = totalPuertas;
	}

	/**
	 * @return the totalRuedas
	 */
	public final int getTotalRuedas() {
		return totalRuedas;
	}

	/**
	 * @param totalRuedas the totalRuedas to set
	 */
	public final void setTotalRuedas(int totalRuedas) {
		this.totalRuedas = totalRuedas;
	}

	public void colision() {
		LOGGER.info("Puertas1: " + this.puertas1);
		LOGGER.info("Puertas2: " + this.puertas2);
		
		// Crear una lista con los coches implicados.
		List<AbstractVehiculo> implicados = new ArrayList<>();
		implicados.add(new Coche(this.puertas1));
		implicados.add(new Coche(this.puertas2));

		// Obtener el total de puertas y ruedas de la colisión.
		this.totalPuertas = colisionBO.contarPuertas(implicados);
		this.totalRuedas = colisionBO.contarRuedas(implicados);
	}

}

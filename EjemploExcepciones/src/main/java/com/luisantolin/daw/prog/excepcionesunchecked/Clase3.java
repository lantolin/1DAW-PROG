package com.luisantolin.daw.prog.excepcionesunchecked;

import java.util.Random;

public class Clase3 {
	String [] cosas = new String[] {"una cosa", "otra cosa"};
	Random generador = new Random();
	
	public void otroMetodoMasDeEjemplo() {
		int valorQueVendrÃ­aDelUsuario = generador.nextInt(4);
		System.out.println( getCosa( valorQueVendrÃ­aDelUsuario ));
	}

	public int getNumCosas() {
		return cosas.length;
	}
	
	private String getCosa( int indice ) {
		return cosas[indice];
	}
}

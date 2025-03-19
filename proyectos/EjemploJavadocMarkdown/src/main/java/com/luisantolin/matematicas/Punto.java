package com.luisantolin.matematicas;

/// Esta clase representa un punto en un plano (2 dimensiones)
/// @author lantolin
public class Punto {
	private int x;
	private int y;

	/// Constructor
	/// @param x coordenada x del punto
	/// @param y coordenada y del punto
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/// Devuelve la coordenada x del punto
	/// @return la coordenada x del punto
	public int getX() {
		return x;
	}

	/// Cambia la coordenada x del punto
	/// @param x la nueva coordenada x del punto
	public void setX(int x) {
		this.x = x;
	}

	/// Devuelve la coordenada y del punto
	/// @return la coordenada y del punto
	public int getY() {
		return y;
	}

	/// Cambia la coordenada y del punto
	/// @param y la nueva coordenada x del punto
	public void setY(int y) {
		this.y = y;
	}

	/// Calcula la distancia del punto hasta el 0,0
	/// @return la distancia del punto hasta el punto 0,0
	public double distancia() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	/// Calcula la distancia del punto hasta un punto dado. Usando el teorema de Pitágoras.
	/// @param p el punto desde el que se quiere calcular la distancia
	/// @return la distancia del punto hasta el punto p
	public double distancia(Punto p) {
		int x = p.x - this.x;
		int y = p.y - this.y;
		return Math.sqrt(x ^ 2 + y ^ 2);
	}
}

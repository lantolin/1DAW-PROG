package com.luisantolin.daw.prog;

/// Markdown es una maravilla, mira en esta clase para ver ejemplos.
///
/// Java ha adoptado Markdown como herramienta alternativa para escribir 
/// comentarios Javadoc.
///
///Puedes encontrar los detalles en la [documentacion oficial](https://docs.oracle.com/en/java/javase/23/javadoc/using-markdown-documentation-comments.html).
///
///De las multiples variantes que hay se ha elegido: [CommonMark](https://spec.commonmark.org/)
///
/// # Estilos de texto
/// Es muy sencillo usar *cursiva* y **negrita** y `monoespaciado`
/// # Listas
/// Faciles y sencillas, listas y sublistas.
///
/// - Maven configurado para usar:
///     - JUnit 5
///     - Java 17
/// - El proyecto se llama Nombre-id1 (tienes que poner tu id1
/// - La clase que contiene el metodo main() que lanza la funcionalidad es App, eso esta configurado en pom.xml
/// Hacer tablas nunca fue tan facil
///
///# Tablas
///
/// | Latin | Greek |
/// |-------|-------|
/// | a     | alpha |
/// | b     | beta  |
/// | c     | gamma |
///
///# Bloques de codigo
///```
///main() {
///  // aqui tienes que poner tu codigo
///}
///```
///# Separadores de seccion.
///
///---
public class App 
{
	/// Constructor por defecto.
	public App() {
		
	}
	
    /// Punto de entrada del programa
    /// @param args no se esperan ni se procesan argumentos
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

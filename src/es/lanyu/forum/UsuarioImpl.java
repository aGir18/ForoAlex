package es.lanyu.forum;

public class UsuarioImpl implements Usuario {

	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public UsuarioImpl(String nombre) {
		setNombre(nombre);
	}

}

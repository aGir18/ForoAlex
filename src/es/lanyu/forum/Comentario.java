package es.lanyu.forum;

import java.time.Instant;

public class Comentario {

	private Usuario usuario;
	private String texto;
	private Tema tema;
	private Instant parse;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public String getTexto() {
		return texto;
	}

	public Tema getTema() {
		return tema;
	}

	public Instant getParse() {
		return parse;
	}

	public Comentario() {}

	public Comentario(Usuario usuario1, String string, Tema tema1, Instant parse) {
	}
	
	@Override
	public String toString() {
		return getUsuario().toString().toUpperCase() + ": " + getTexto().substring(0, 19) 
				+ " en " + getTema().toString() + " a las " + getParse().toString();
	}
	
}

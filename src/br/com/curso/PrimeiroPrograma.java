package br.com.curso;

import java.util.Objects;

import br.com.curso.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/* 
		   int a = 2;
		   int b = 3;
		   System.out.println("Hello World! " + (a+b));
		*/
	   Gato gato = new Gato("Garfield", "Marrom", 35);
	   Livros livro = new Livros();
	   
	   System.out.println(gato);
	   System.out.println(livro);
	}

}

class Livros {
	private String nome;
	private String npag;
	
	public Livros() {
	}

	public Livros(String nome, String npag) {
		this.nome = nome;
		this.npag = npag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNpag() {
		return npag;
	}

	public void setNpag(String npag) {
		this.npag = npag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, npag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(npag, other.npag);
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}
	
}

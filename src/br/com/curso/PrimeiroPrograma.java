package br.com.curso;

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
}

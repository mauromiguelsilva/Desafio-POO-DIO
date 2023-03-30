package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo(" Curso Java");
		curso.setDescricao(" Descrição curso java");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso Javascript");
		curso2.setDescricao(" Descrição curso javascript");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Descricao mentoria java");
		
		
		System.out.println(curso);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}

package Main;

import Classes.EmpregadoDaFaculdade;
import Classes.GeradorDeRelatorio;
import Classes.ProfessorDaFaculdade;
import Classes.Reitor;

public class Main {
	public static void main(String[]args) {
		ProfessorDaFaculdade prof = new ProfessorDaFaculdade("Jhon", 10, 1);
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("Jailson", 10);
		Reitor reitor = new Reitor("Socorro", 15);
		GeradorDeRelatorio gerador = new GeradorDeRelatorio();
		gerador.adiciona(prof);
		gerador.adiciona(empregado);
		gerador.adiciona(reitor);
	}
}

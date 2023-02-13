package Classes;

public class Reitor extends EmpregadoDaFaculdade {
	
	public Reitor(String nome, double salario) {
		super(nome,salario);
	}
	
	// informações extras
    public String getInfo() {
        return super.getInfo() + " e ele é um reitor";
    }
     // não sobrescrevemos o getGastos!!!
}

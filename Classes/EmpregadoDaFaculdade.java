package Classes;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    
    public EmpregadoDaFaculdade(String nome, double salario) {
    	this.nome = nome;
    	this.salario = salario;
    }
    
    public double getGastos() {
        return this.salario;
    }
    public String getInfo() {
        return "nome: " + this.nome + " com salário " + this.salario;
    }
     // métodos de get, set e outros
    
    public String getNome() {
    	return this.nome;
    }
}

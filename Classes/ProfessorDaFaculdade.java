package Classes;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;
    
    public ProfessorDaFaculdade(String nome, double salario, int horaAula) {
    	super(nome,salario);
    	this.horasDeAula = horaAula;
    }
    
    @Override
    public double getGastos() {
    	double infoSalario = super.getGastos();
        return infoSalario + this.horasDeAula * 10;
    }
    
    @Override
    public String getInfo() {
        String informacaoBasica = "Nome: " + this.getNome();
        String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula + " com salário de: " + this.getGastos();
        return informacao;
    }
    
    // métodos de get, set e outros que forem necessários
}
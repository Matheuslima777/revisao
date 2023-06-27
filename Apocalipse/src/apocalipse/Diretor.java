
package apocalipse;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
     private double PREMIO = (0.2);

    public Diretor(String cpf, String rg, String matricula, Setor_Funcionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, datanascimento, nome, telefone, email, endereco);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return salario + (salario * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você deixou de ser vagabundo" + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Vá vender sua arte na praia" + funcionario);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n PREMIO: =" + (PREMIO*100) + "%";
    }

    
     
     
     
}

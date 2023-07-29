import javax.swing.JOptionPane;
import java.time.LocalDate;

abstract class Exame {
    public String nomePaciente;
    public String tipoSanguineo;
    private int anoNascimento;
    public double quantidadeMgPorL;
    public double qntDeTriglicerideos;

    public Exame() {}

    public void cadastrarExame() {
        nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente: "));
    }
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Nome: "+ nomePaciente + "\nTipo Sanguíneo: "+ tipoSanguineo );
    }

    public void setQuantidadeMgPorL(double quantidadeMgPorL) {
        this.quantidadeMgPorL = quantidadeMgPorL;
    }
     public void setqntDeTriglicerideos(double qntDeTriglicerideos) {
        this.qntDeTriglicerideos = qntDeTriglicerideos;
    }

    public abstract String classificarResultado();

    public int getIdade() {
        return 2023 - anoNascimento;
    }

    public double getQuantidadeMgPorL() {
        return quantidadeMgPorL;
    }
    public double getqntDeTriglicerideos() {
        return qntDeTriglicerideos;
    }
}

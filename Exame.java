import javax.swing.JOptionPane;
import java.time.LocalDate;

abstract class Exame {
    public String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;
    private double quantidadeMgPorL;

    public Exame() {}

    public void cadastrarExame() {
        nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo do paciente: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente: "));
    }

    public void setQuantidadeMgPorL(double quantidadeMgPorL) {
        this.quantidadeMgPorL = quantidadeMgPorL;
    }

    public abstract String classificarResultado();

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Nome: "+ nomePaciente + "\nTipo Sanguíneo: "+ tipoSanguineo + "\nValor do exame: " + quantidadeMgPorL + " mg/L\nClassificação: " + classificarResultado());
    }

    public int getIdade() {
        return LocalDate.now().getYear() - anoNascimento;
    }

    public double getQuantidadeMgPorL() {
        return quantidadeMgPorL;
    }
}

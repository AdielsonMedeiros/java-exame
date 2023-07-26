
import javax.swing.JOptionPane;

class Colesterol extends Exame {
    private double ldl;
    private double hdl;
    public char risco;

    public Colesterol() {}

    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        ldl = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de LDL:"));
        hdl = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de HDL:"));
        risco = JOptionPane.showInputDialog("Digite o risco (B, M ou A):").charAt(0);
        
    }

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "nome: " +nomePaciente+ "\nLDL: "+ldl+ "\nHDL: " +hdl+ "\nRisco: "+ risco +"\nClassificação: " + classificarResultado());
    }

    @Override
    public String classificarResultado() {
        StringBuilder resultado = new StringBuilder();
        if (getIdade() <= 19 && hdl > 45) {
            resultado.append("HDL - BOM\n");
        } else if (getIdade() > 19 && hdl > 40) {
            resultado.append("HDL - BOM\n");
        } else {
            resultado.append("HDL - RUIM\n");
        }

        if (risco == 'B' && ldl < 100) {
            resultado.append("LDL - BOM");
        } else if (risco == 'M' && ldl < 70) {
            resultado.append("LDL - BOM");
        } else if (risco == 'A' && ldl < 50) {
            resultado.append("LDL - BOM");
        } else {
            resultado.append("LDL - RUIM");
        }
        
        return resultado.toString();
    }
}
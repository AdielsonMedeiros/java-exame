import javax.swing.JOptionPane;

class Glicemia extends Exame {
    public Glicemia() {}
    
    public void mostrarResultado() {
    JOptionPane.showMessageDialog(null, "Nome: "+ nomePaciente + "\nTipo Sanguíneo: "+ tipoSanguineo + "\nValor do exame: " + quantidadeMgPorL + " mg/L\nClassificação: " + classificarResultado());
}
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        double quantidadeMgPorL = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Glicose mg/dL:"));
        setQuantidadeMgPorL(quantidadeMgPorL);
    }
    
    @Override
    public String classificarResultado() {
        if (getQuantidadeMgPorL() < 100) {
            return "Normoglicemia";
        } else if (getQuantidadeMgPorL() >= 100 && getQuantidadeMgPorL() < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }
}

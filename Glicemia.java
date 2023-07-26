import javax.swing.JOptionPane;

class Glicemia extends Exame {
    public Glicemia() {}

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

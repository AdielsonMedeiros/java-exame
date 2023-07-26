import javax.swing.JOptionPane;

class Triglicerideos extends Exame {

    public Triglicerideos() {}

    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        double quantidadeMgPorL = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade triglicerideo:"));
        setQuantidadeMgPorL(quantidadeMgPorL);
    }

    @Override
    public String classificarResultado() {
        if (getIdade() <= 9 && getQuantidadeMgPorL() < 75) {
            return "BOM";
        } else if (getIdade() >= 10 && getIdade() <= 19 && getQuantidadeMgPorL() < 90) {
            return "BOM";
        } else if (getIdade() > 19 && getQuantidadeMgPorL() < 150) {
            return "BOM";
        } else {
            return "RUIM";
        }
    }
}

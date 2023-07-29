import javax.swing.JOptionPane;

class Triglicerideos extends Exame {
    
    public Triglicerideos() {}

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "Nome: "+ nomePaciente + "\nTipo Sanguíneo: "+ tipoSanguineo + "\nValor do exame: " + qntDeTriglicerideos +" mg/L"+"\nIdade: "+getIdade()+"\nClassificação: " + classificarResultado());
    }

    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        double qntDeTriglicerideos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade triglicerideo:"));
        setqntDeTriglicerideos(qntDeTriglicerideos);
    }

    @Override
    public String classificarResultado() {
        if (getIdade() <= 9 && getqntDeTriglicerideos() < 75) {
            return "BOM";
        } else if (getIdade() >= 10 && getIdade() <= 19 && getqntDeTriglicerideos() < 90) {
            return "BOM";
        } else if (getIdade() > 19 && getqntDeTriglicerideos() < 150) {
            return "BOM";
        } else {
            return "RUIM";
        }
    }
}

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Glicemia glicemia = new Glicemia();
        glicemia.cadastrarExame();
        glicemia.mostrarResultado();

        Colesterol colesterol = new Colesterol();
        colesterol.cadastrarExame();
        colesterol.mostrarResultado();

        Triglicerideos triglicerideos = new Triglicerideos();
        triglicerideos.cadastrarExame();
        triglicerideos.mostrarResultado();
    }
}
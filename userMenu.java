package neppo.ic;

import javax.swing.JOptionPane;

public class userMenu {

    private String[] opcoes;

    public userMenu(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public void show() {
        JOptionPane.showMessageDialog(null,"Por favor Digite o número da opção");
        for (int i = 0; i < this.opcoes.length; i++) {
            String opcao = this.opcoes[i];
            opcao = JOptionPane.showMessageDialog((i + 1) + " - " + opcao);
        }
    }
}

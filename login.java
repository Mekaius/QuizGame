package neppo.ic;


import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import neppo.ic.usuario;
import javax.swing.JPasswordField;

public class login {

    Scanner le = new Scanner(System.in);
    String sen;
    String usu;

    public List<usuario> Log(List<usuario> auxArray) {
        if (!auxArray.isEmpty()) {
            usu = JOptionPane.showInputDialog(null, "Insira o Usuário");
            sen = JOptionPane.showInputDialog(null, "Insira a senha");

            for (int index = 0; index < auxArray.size(); index++) {

                if (usu.equals(auxArray.get(index).geteMail()) && sen.equals(auxArray.get(index).getSenha())) {
                    JOptionPane.showMessageDialog(null, "Dados confere");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados não conefere");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nao há informação no Array");
        }
        return auxArray;
    }

}

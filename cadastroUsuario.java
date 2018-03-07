package neppo.ic;


import java.util.List;
import javax.swing.JFrame;


public class cadastroUsuario extends JFrame {
    
    public List<usuario> CadastroUser(List<usuario> auxArray) {

        Validation valid = new Validation();
        int idUser = 0;

        String firstName = valid.inputData("Informe seu Primeiro Nome", "Não Conforme", 3, 30);
        String lastName = valid.inputData("Inform seu Sobrenome", "Não Conforme", 3, 30);
        String eMail = valid.inputDataEmail("Digite um E-mail valido", 8, 40);
        Integer idade = valid.inputDataInt("Informe sua idade", "Não Conforme", 8, 120);
        String senha = valid.inputData("Insira uma senha", "Não Conforme", 8, 30);
        usuario newUser = new usuario(idUser, firstName, lastName, eMail, idade, senha);
        auxArray.add(newUser);
        return auxArray;

    }
}

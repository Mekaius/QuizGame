package neppo.ic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Menu {
    private List<usuario> dataUsers = new ArrayList<>(); 
    public Menu() {
    }
    

    public void showMenu() {
        
        int x = 0;
        Scanner l = new Scanner(System.in);
        cadastroUsuario newCadUser = new cadastroUsuario();
        login Log = new login();
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar\n2 - Quiz\n3 - Introdução aos objetivos da Programação\n4 - Curiosidades\n5 - Pontuação e Bonificação\n6 - Relatório de Desempenhouporte", x));
            switch (x) {
                case 1:
                    dataUsers = newCadUser.CadastroUser(dataUsers);
                    break;
                case 2:
                    dataUsers = Log.Log(dataUsers);
                    break;
                case 3:
                    System.out.println("Em Construção");
                    break;
                case 4:
                    System.out.println("Em Construção");
                    break;
                case 5:
                    System.out.println("Em Construção");
                    break;
                case 6:
                    System.out.println("Encerrado");
                    break;

            }
        } while (x != 6);
    }
}

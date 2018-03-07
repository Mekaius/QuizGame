package neppo.ic;

public class arrayQuiz extends Quiz {
    private static int idPerGenerator;
    
    private int idPergunta;
    public arrayQuiz(int idPergunta, int nivel, String descPergunta,boolean r1, String descR1, boolean r2, String descR2, boolean r3, String descR3, boolean r4, String descR4){
        super(nivel, descPergunta,r1, descR1, r2, descR2, r3, descR3, r4, descR4);
        idPergunta = ++idPerGenerator;
    }
    public void arrayQuiz1(int idPergunta, int nivel, String descPergunta,boolean r1, String descR1, boolean r2, String descR2, boolean r3, String descR3, boolean r4, String descR4){
        
        idPergunta = 1;
        nivel = 1;
        descPergunta = "Quais dessas classes é do tipo primitivo?";
        r1 = true;
        descR1 = "Integer";
        r2 = false;
        descR2 = "import";
        r3 = false;
        descR2 = "idP";
        r2 = false;
        descR2 = "java.util.Scanner";
        
    }
    
}

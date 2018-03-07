package neppo.ic;

public class usuario extends user {

    private static int idGenerator;

    private int idUser;
    private String senha;

    public usuario(int idUser, String firstName, String lastName, String eMail, int age, String senha) {
        super(firstName, lastName, eMail, age);
        this.idUser = ++idGenerator;
        this.senha = senha;
    }

    public void show() {
        System.out.println("Id: " + getIdUser());
        System.out.println("Nome:" + getFirstName() + " " + getLastName());
        System.out.println("E-mail: " + geteMail());
        System.out.println("Idade: " + getAge());
    }
    
    public void setIdUser(int idUser){
        this.idUser = idUser;
    }
    public int getIdUser (){
        return idUser;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    


}

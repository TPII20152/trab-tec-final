package Classes;

/**
 *
 * @author cesar.nascimento
 */
public class Funcionario extends Pessoa{
    private String dtcad;
    private String login;
    private String senha;
    
    public void setDtCad(String dtcad){
        this.dtcad = dtcad;
    }
    public String getDtCad(){
        return dtcad;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
}
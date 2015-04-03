package ModuloDePessoas;
/**
 *
 * @author cesar.nascimento
 */
public abstract class Pessoa {
    
    private String nome;
    private String dtnasc;
    private char sexo;
    private String cpf;
    private int rg;
    private String cep;
    private String telefone;
    private String rua;
    private int numero;
    private String estado;
    private String cidade;
    private String bairro;
    private String comple;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setDtNasc(String dtnasc){
        this.dtnasc = dtnasc;
    }
    public String getDtNasc(){
        return dtnasc;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return sexo;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }
    
    public void setRG(int rg){
        this.rg = rg;
    }
    public int getRG(){
        return rg;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    
    public void setComple(String comple){
        this.comple = comple;
    }
    public String getComple(){
        return comple;
    }
}
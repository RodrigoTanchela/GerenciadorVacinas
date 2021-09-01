
package Modelo;


public class Local {
    private String nome;
    private String cnpj;
    
    public Local(String nome,String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    
    public String getNome() {
        return nome;
    }

    
    public String getCnpj() {
        return cnpj;
    }
    
    public String toString(){
        return "Nome: "+this.nome+
                ", cnpj: "+this.cnpj;
                
    }
    
    
}


package Modelo;

public class Empresa {
    private String nome;
    private String pais;

    public Empresa(String nome, String pais){
        this.nome = nome;
        this.pais = pais;
    }
    
    public String getNome() {
        return nome;
    }
    public String getPais(){
        return pais;
    }
    
    public String toString(){
        return "Empresa: "+this.nome
                + ", Pais "+this.pais;
    }
    
}

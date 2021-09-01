
package Modelo;

import java.util.ArrayList;


public class Transportadora {
     private String nome;
     private String cnpj;
     private ArrayList<Veiculo>veiculo;

    public Transportadora(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.veiculo = new ArrayList<>();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void addVeiculo(Veiculo vei){
        this.veiculo.add(vei);
    }
    
     public double somaValorTrasnporte(){
          double soma = 0;
        for(Veiculo umVeiculo: this.veiculo){
            soma+=umVeiculo.calculoValorTransporte();
        }
        return soma;
    
     }
    
    public String toString(){
        String texto = "Empresa: "+this.nome+", cnpj"+this.cnpj;
        for(Veiculo vei: veiculo){
            texto=texto+vei.getModelo();
        } 
        texto = texto+somaValorTrasnporte();
        return texto;
    }
}

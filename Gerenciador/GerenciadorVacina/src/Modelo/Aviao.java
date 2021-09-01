
package Modelo;

import java.util.ArrayList;


public class Aviao extends Veiculo {
    private int hora;
     private ArrayList<Vacina>vacina;
    
     public Aviao(int codigo, String modelo, String pontoDeEntrada, String pontoDeChegada,int combustivel, double frete,  Vacina vacina, int hora){
       super(codigo, modelo, pontoDeEntrada, pontoDeChegada, combustivel, frete, vacina);
       this.hora=hora;
 
    }
     
    public double calculoValorTransporte(){
        return this.combustivel * this.hora + this.frete;
    } 
     
    
     @Override
    public String toString(){
        return "modelo do avião: "+this.modelo
                +" Codigo de rastreamento do avião: "+this.codigo
                +", Aeroporto de Entrada do avião: "+this.pontoDeEntrada
                + ", Aeroporto de chegada do avião: "+this.pontoDeChegada
                +", horas de vol: "+this.hora
                +", Vacina transportada:  "+this.vacina  
                +", Valor do transporte: "+this.calculoValorTransporte();
    }
     
}
